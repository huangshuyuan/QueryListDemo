package com.bigkoo.quicksidebardemo.model;

import java.util.List;

/**
 * Author: syhuang
 * Date:  2017/9/7
 */

public class CarSeriesInfoResult extends BaseResult {


    private List<ResultBean> Result;

    public List<ResultBean> getResult() {
        return Result;
    }

    public void setResult(List<ResultBean> Result) {
        this.Result = Result;
    }

    public static class ResultBean {
        /**
         * Id : 2196
         * CarBrandId : 180
         * Depth : 2
         * Name : 长安沃尔沃
         * FullName :
         * CarList : [
         {
         "id": "2197",
         "name": "S80L",
         "fullname": "沃尔沃S80L",
         "initial": "W",
         "parentid": "2196",
         "logo": "http://api.jisuapi.com/car/static/images/logo/300/2197.png",
         "price": "",
         "salestate": "停销",
         "depth": "3",
         "list": [
         {
         "id": "29743",
         "name": "2015款 2.0 T5 智逸版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29743.jpg",
         "price": "39.99万",
         "yeartype": "2015",
         "productionstate": "在产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29744",
         "name": "2015款 2.0 T5 智雅版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29744.JPG",
         "price": "43.49万",
         "yeartype": "2015",
         "productionstate": "在产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29745",
         "name": "2015款 2.0 T5 智尊·行政版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29745.JPG",
         "price": "49.99万",
         "yeartype": "2015",
         "productionstate": "在产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29746",
         "name": "2014款 2.0 T5 智逸版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29746.JPG",
         "price": "39.99万",
         "yeartype": "2014",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29747",
         "name": "2014款 2.0 T5 智雅版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29747.JPG",
         "price": "43.49万",
         "yeartype": "2014",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29748",
         "name": "2014款 2.0 T5 智尊·行政版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29748.jpg",
         "price": "48.99万",
         "yeartype": "2014",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29749",
         "name": "2014款 3.0 T6 AWD 智尊·行政版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29749.jpg",
         "price": "71.99万",
         "yeartype": "2014",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29750",
         "name": "2012款 2.0T 智尚版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29750.JPG",
         "price": "37.49万",
         "yeartype": "2012",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29751",
         "name": "2012款 2.0 T5 智雅版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29751.jpg",
         "price": "40.49万",
         "yeartype": "2012",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29752",
         "name": "2012款 2.0 T5 智尊版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29752.jpg",
         "price": "44.99万",
         "yeartype": "2012",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29753",
         "name": "2012款 3.0 T6 AWD 智雅版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29753.jpg",
         "price": "59.39万",
         "yeartype": "2012",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29754",
         "name": "2012款 3.0 T6 AWD 智尊版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29754.jpg",
         "price": "65.99万",
         "yeartype": "2012",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29759",
         "name": "2011款 3.0 T6 AWD 智尊版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29759.JPG",
         "price": "65.86万",
         "yeartype": "2011",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29758",
         "name": "2011款 3.0 T6 AWD 智雅版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29758.JPG",
         "price": "59.38万",
         "yeartype": "2011",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29757",
         "name": "2011款 2.0T 智尊版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29757.jpg",
         "price": "43.85万",
         "yeartype": "2011",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29756",
         "name": "2011款 2.0T 智雅版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29756.jpg",
         "price": "39.99万",
         "yeartype": "2011",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29755",
         "name": "2011款 2.0T 智尚版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29755.JPG",
         "price": "36.8万",
         "yeartype": "2011",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29760",
         "name": "2010款 2.5T 智尚版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29760.jpg",
         "price": "39.8万",
         "yeartype": "2010",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29761",
         "name": "2010款 2.5T 智雅版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29761.jpg",
         "price": "43.3万",
         "yeartype": "2010",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29762",
         "name": "2010款 2.5T 智尊版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29762.jpg",
         "price": "46.85万",
         "yeartype": "2010",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29763",
         "name": "2010款 3.0 T6 AWD 智雅版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29763.jpg",
         "price": "61.38万",
         "yeartype": "2010",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29764",
         "name": "2010款 3.0 T6 AWD 智尊版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29764.jpg",
         "price": "67.86万",
         "yeartype": "2010",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29765",
         "name": "2009款 2.5T 智尚版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29765.jpg",
         "price": "39.8万",
         "yeartype": "2009",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29766",
         "name": "2009款 2.5T 智雅版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29766.jpg",
         "price": "42.98万",
         "yeartype": "2009",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29767",
         "name": "2009款 2.5T 智尊版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29767.jpg",
         "price": "46.38万",
         "yeartype": "2009",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29768",
         "name": "2009款 3.0 T6 AWD 智雅版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29768.jpg",
         "price": "60.8万",
         "yeartype": "2009",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         },
         {
         "id": "29769",
         "name": "2009款 3.0 T6 AWD 智尊版",
         "initial": "W",
         "parentid": "2197",
         "logo": "29769.jpg",
         "price": "67.86万",
         "yeartype": "2009",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "中大型车",
         "depth": "4"
         }
         ]
         },
         {
         "id": "2198",
         "name": "S40",
         "fullname": "长安沃尔沃S40",
         "initial": "W",
         "parentid": "2196",
         "logo": "http://api.jisuapi.com/car/static/images/logo/300/2198.JPG",
         "price": "",
         "salestate": "停销",
         "depth": "3",
         "list": [
         {
         "id": "29770",
         "name": "2012款 2.0L 自动 典雅版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29770.JPG",
         "price": "20.9万",
         "yeartype": "2012",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29771",
         "name": "2012款 2.0L 自动 尊享版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29771.JPG",
         "price": "21.9万",
         "yeartype": "2012",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29772",
         "name": "2011款 2.0 自动智尚版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29772.JPG",
         "price": "26.8万",
         "yeartype": "2011",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29773",
         "name": "2011款 2.0 自动智雅版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29773.jpg",
         "price": "28.8万",
         "yeartype": "2011",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29774",
         "name": "2011款 2.0 自动智尊版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29774.JPG",
         "price": "30.8万",
         "yeartype": "2011",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29775",
         "name": "2010款 2.0手动挡",
         "initial": "W",
         "parentid": "2198",
         "logo": "29775.JPG",
         "price": "24.8万",
         "yeartype": "2010",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29776",
         "name": "2010款 2.0智尚版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29776.JPG",
         "price": "26.8万",
         "yeartype": "2010",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29777",
         "name": "2010款 2.0智雅版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29777.JPG",
         "price": "28.8万",
         "yeartype": "2010",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29778",
         "name": "2010款 2.0智尊版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29778.JPG",
         "price": "30.8万",
         "yeartype": "2010",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29785",
         "name": "2009款 T5 R—Design",
         "initial": "W",
         "parentid": "2198",
         "logo": "29785.jpg",
         "price": "37.8万",
         "yeartype": "2009",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29784",
         "name": "2009款 2.0L 手自一体智尊版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29784.jpg",
         "price": "30.8万",
         "yeartype": "2009",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29783",
         "name": "2009款 2.0L 手自一体智雅版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29783.jpg",
         "price": "28.8万",
         "yeartype": "2009",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29782",
         "name": "2009款 2.0L 手自一体智尚版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29782.jpg",
         "price": "26.8万",
         "yeartype": "2009",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29781",
         "name": "2009款 2.0 智雅版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29781.jpg",
         "price": "26.8万",
         "yeartype": "2009",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29780",
         "name": "2009款 2.0 智尚版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29780.jpg",
         "price": "25.3万",
         "yeartype": "2009",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29779",
         "name": "2009款 2.0手动挡",
         "initial": "W",
         "parentid": "2198",
         "logo": "29779.jpg",
         "price": "24.8万",
         "yeartype": "2009",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29786",
         "name": "2008款 2.4i 手自一体智雅限量版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29786.JPG",
         "price": "28万",
         "yeartype": "2008",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29787",
         "name": "2007款 2.4智尚版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29787.JPG",
         "price": "25万",
         "yeartype": "2007",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29788",
         "name": "2007款 2.4i",
         "initial": "W",
         "parentid": "2198",
         "logo": "29788.JPG",
         "price": "31.8万",
         "yeartype": "2007",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29789",
         "name": "2007款 2.4智雅版",
         "initial": "W",
         "parentid": "2198",
         "logo": "29789.JPG",
         "price": "31.8万",
         "yeartype": "2007",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29790",
         "name": "2007款 2.5 T5",
         "initial": "W",
         "parentid": "2198",
         "logo": "29790.JPG",
         "price": "35.8万",
         "yeartype": "2007",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29791",
         "name": "2006款 2.4i 手自一体",
         "initial": "W",
         "parentid": "2198",
         "logo": "29791.JPG",
         "price": "30.5万",
         "yeartype": "2006",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         },
         {
         "id": "29792",
         "name": "2006款 2.5 T5 手自一体",
         "initial": "W",
         "parentid": "2198",
         "logo": "29792.JPG",
         "price": "36.8万",
         "yeartype": "2006",
         "productionstate": "停产",
         "salestate": "停产",
         "sizetype": "紧凑型车",
         "depth": "4"
         }
         ]
         }
         ]
         * Initial : W
         * Price :
         */

        private String Id;
        private String CarBrandId;
        private String Depth;
        private String Name;
        private String FullName;
        private String CarList;
        private String Initial;
        private String Price;

        public String getId() {
            return Id;
        }

        public void setId(String Id) {
            this.Id = Id;
        }

        public String getCarBrandId() {
            return CarBrandId;
        }

        public void setCarBrandId(String CarBrandId) {
            this.CarBrandId = CarBrandId;
        }

        public String getDepth() {
            return Depth;
        }

        public void setDepth(String Depth) {
            this.Depth = Depth;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getFullName() {
            return FullName;
        }

        public void setFullName(String FullName) {
            this.FullName = FullName;
        }

        public String getCarList() {
            return CarList;
        }

        public void setCarList(String CarList) {
            this.CarList = CarList;
        }

        public String getInitial() {
            return Initial;
        }

        public void setInitial(String Initial) {
            this.Initial = Initial;
        }

        public String getPrice() {
            return Price;
        }

        public void setPrice(String Price) {
            this.Price = Price;
        }
    }
}
