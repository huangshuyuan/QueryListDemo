package com.bigkoo.quicksidebardemo;

import android.support.v7.widget.RecyclerView;

import com.bigkoo.quicksidebardemo.model.CarSeriesResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


/**
 * Adapter holding a list of animal names of type String. Note that each item must be unique.
 */
public abstract class CarSeriesListAdapter<VH extends RecyclerView.ViewHolder>
        extends RecyclerView.Adapter<VH> {
    private List<CarSeriesResult.ResultBean> items = new ArrayList<>();

    public CarSeriesListAdapter() {
        setHasStableIds(true);
    }

    public void add(CarSeriesResult.ResultBean object) {
        items.add(object);
        notifyDataSetChanged();
    }

    public void add(int index, CarSeriesResult.ResultBean object) {
        items.add(index, object);
        notifyDataSetChanged();
    }

    public void addAll(Collection<? extends CarSeriesResult.ResultBean> collection) {
        if (collection != null) {
            items.addAll(collection);
            notifyDataSetChanged();
        }
    }

    public void addAll(CarSeriesResult.ResultBean... items) {
        addAll(Arrays.asList(items));
    }

    public void clear() {
        items.clear();
        notifyDataSetChanged();
    }

    public void remove(String object) {
        items.remove(object);
        notifyDataSetChanged();
    }

    public CarSeriesResult.ResultBean getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).hashCode();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
