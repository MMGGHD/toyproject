package com.example.kakao.core;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;

import com.example.kakao.product.Product;
import com.example.kakao.user.User;

public class MockData {

    protected User getUser(int id, String username) {
        return User.builder()
                .id(id)
                .email(username + "@nate.com")
                .password("meta1234!")
                .username(username)
                .build();
    }

    protected Product getProduct(int id, String name) {
        return Product.builder()
                .id(id)
                .build();
    }

}
