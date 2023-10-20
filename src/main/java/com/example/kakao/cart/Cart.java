package com.example.kakao.cart;

import lombok.*;

import javax.persistence.*;

import com.example.kakao.product.Product;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "cart_tb")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 판매자 이름
    private String sellerName;

    // 상품 테이블
    private Product product;

    // 수량
    private Integer quantity;

    // 배송비
    private Integer deliveryFee;

    // // 예정금액
    // private Integer estimatedPrivce;

    public Cart(Integer id, String sellerName, Product product, Integer quantity, Integer deliveryFee) {
        this.id = id;
        this.sellerName = sellerName;
        this.product = product;
        this.quantity = quantity;
        this.deliveryFee = deliveryFee;
    }

}