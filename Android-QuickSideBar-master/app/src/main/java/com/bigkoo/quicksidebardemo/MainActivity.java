package com.bigkoo.quicksidebardemo;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bigkoo.quicksidebar.QuickSideBarTipsView;
import com.bigkoo.quicksidebar.QuickSideBarView;
import com.bigkoo.quicksidebar.listener.OnQuickSideBarTouchListener;
import com.bigkoo.quicksidebardemo.constants.DataConstants;
import com.bigkoo.quicksidebardemo.model.CarSeriesResult;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.gson.Gson;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnQuickSideBarTouchListener {
    RecyclerView recyclerView;
    HashMap<String, Integer> letters = new HashMap<>();
    QuickSideBarView     quickSideBarView;
    QuickSideBarTipsView quickSideBarTipsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        quickSideBarView = (QuickSideBarView) findViewById(R.id.quickSideBarView);
        quickSideBarTipsView = (QuickSideBarTipsView) findViewById(R.id.quickSideBarTipsView);

        //设置监听
        quickSideBarView.setOnQuickSideBarTouchListener(this);


        //设置列表数据和浮动header
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        // Add the sticky headers decoration
        CityListWithHeadersAdapter adapter = new CityListWithHeadersAdapter();

        //        //GSON解释出来
        //        Type listType = new TypeToken<LinkedList<City>>() {
        //        }.getType();
        Gson gson = new Gson();
        //        LinkedList<City> cities = gson.fromJson(DataConstants.cityDataList, listType);


        CarSeriesResult result = gson.fromJson(DataConstants.carData, CarSeriesResult.class);
        List<CarSeriesResult.ResultBean> carSeriesList = result.getResult();


        ArrayList<String> customLetters = new ArrayList<>();

        int position = 0;
        for (CarSeriesResult.ResultBean bean : carSeriesList) {
            String letter = bean.getInitial();//字母
            //如果没有这个key则加入并把位置也加入
            if (!letters.containsKey(letter)) {
                letters.put(letter, position);
                customLetters.add(letter);
            }
            position++;
        }

        //不自定义则默认26个字母
        quickSideBarView.setLetters(customLetters);
        adapter.addAll(carSeriesList);
        recyclerView.setAdapter(adapter);

        final StickyRecyclerHeadersDecoration headersDecor = new StickyRecyclerHeadersDecoration(adapter);
        recyclerView.addItemDecoration(headersDecor);

        // Add decoration for dividers between list items
        recyclerView.addItemDecoration(new DividerDecoration(this));
    }


    @Override
    public void onLetterChanged(String letter, int position, float y) {
        quickSideBarTipsView.setText(letter, position, y);
        //有此key则获取位置并滚动到该位置
        if (letters.containsKey(letter)) {
            recyclerView.scrollToPosition(letters.get(letter));
        }
    }

    @Override
    public void onLetterTouching(boolean touching) {
        //可以自己加入动画效果渐显渐隐
        quickSideBarTipsView.setVisibility(touching ? View.VISIBLE : View.INVISIBLE);
    }

    private class CityListWithHeadersAdapter extends CarSeriesListAdapter<CityListWithHeadersAdapter.ViewHolder>
            implements StickyRecyclerHeadersAdapter<RecyclerView.ViewHolder> {
        Context mContext;

        class ViewHolder extends RecyclerView.ViewHolder {
            TextView  city_name;
            ImageView car_img;

            public ViewHolder(View itemView) {
                super(itemView);
                city_name = (TextView) itemView.findViewById(R.id.city_name);
                car_img = (ImageView) itemView.findViewById(R.id.car_img);
            }
        }

        @Override
        public CityListWithHeadersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            mContext = parent.getContext();
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.view_item, parent, false);
            return new CityListWithHeadersAdapter.ViewHolder(view) {
            };
        }

        @Override
        public void onBindViewHolder(CityListWithHeadersAdapter.ViewHolder holder, int position) {
            holder.city_name.setText(getItem(position).getName());

            Glide.with(mContext).load(getItem(position).getLogo())
                    .error(R.mipmap.ic_launcher)// 设置错误图片
                    .crossFade()// 设置淡入淡出效果，默认300ms，可以传参
                    .placeholder(R.mipmap.ic_launcher)// 设置占位图
                    .diskCacheStrategy(DiskCacheStrategy.RESULT)// 缓存修改过的图片
                    .into(holder.car_img);


        }

        @Override
        public long getHeaderId(int position) {
            return getItem(position).getInitial().charAt(0);
        }

        @Override
        public RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup parent) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.view_header, parent, false);
            return new RecyclerView.ViewHolder(view) {
            };
        }

        @Override
        public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder, int position) {
            TextView textView = (TextView) holder.itemView;
            textView.setText(String.valueOf(getItem(position).getInitial()));
            //            holder.itemView.setBackgroundColor(getRandomColor());
        }

        private int getRandomColor() {
            SecureRandom rgen = new SecureRandom();
            return Color.HSVToColor(150, new float[]{
                    rgen.nextInt(359), 1, 1
            });
        }

    }
}
