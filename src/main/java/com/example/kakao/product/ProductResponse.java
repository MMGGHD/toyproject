package com.example.kakao.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ProductResponse {
    // 상품 목록보기
    @ToString
    @Getter
    @Setter
    public static class ProductDTO {
        private Integer Id;
        private String thumbnail;
        private String seller;
        private String productTitle;
        private Integer beforeDiscount;
        private Integer discountreat;
        private Integer totalprize;

        public ProductDTO(Product product) {
            this.thumbnail = thumbnail;
            this.seller = seller;
            this.productTitle = productTitle;
            this.beforeDiscount = beforeDiscount;
            this.discountreat = discountreat;
            this.totalprize = totalprize;
        }
    }

}