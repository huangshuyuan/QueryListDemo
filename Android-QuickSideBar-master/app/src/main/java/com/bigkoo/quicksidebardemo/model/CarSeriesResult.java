package com.bigkoo.quicksidebardemo.model;

import java.util.List;

/**
 * Author: syhuang
 * Date:  2017/9/7
 */

public class CarSeriesResult extends BaseResult {

    private List<ResultBean> Result;

    public List<ResultBean> getResult() {
        return Result;
    }

    public void setResult(List<ResultBean> Result) {
        this.Result = Result;
    }

    public static class ResultBean {
        /**
         * Id : 1
         * Name : 奥迪
         * Initial : A
         * Parentid : 0
         * Logo : http://api.jisuapi.com/car/static/images/logo/300/1.png
         * Depth : 1
         */

        private String Id;
        private String Name;
        private String Initial;
        private String Parentid;
        private String Logo;
        private String Depth;

        public String getId() {
            return Id;
        }

        public void setId(String Id) {
            this.Id = Id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getInitial() {
            return Initial;
        }

        public void setInitial(String Initial) {
            this.Initial = Initial;
        }

        public String getParentid() {
            return Parentid;
        }

        public void setParentid(String Parentid) {
            this.Parentid = Parentid;
        }

        public String getLogo() {
            return Logo;
        }

        public void setLogo(String Logo) {
            this.Logo = Logo;
        }

        public String getDepth() {
            return Depth;
        }

        public void setDepth(String Depth) {
            this.Depth = Depth;
        }
    }
}
