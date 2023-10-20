package com.example.kakao.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import com.example.kakao._core.advice.ValidAdvice;
import com.example.kakao._core.config.FilterConfig;
import com.example.kakao.core.MockData;
import com.fasterxml.jackson.databind.ObjectMapper;

@Import({ ValidAdvice.class, FilterConfig.class }) // webmvc가 ioc에 올려주지 않는 것을 직접 로딩하기
@EnableAspectJAutoProxy // aop 활성화
@WebMvcTest(ProductRestController.class) // f - ds - uc
public class ProductRestControllerTest extends MockData {

    @Autowired
    private MockMvc mvc; // 컨트롤러 요청 객체

    @MockBean
    private ProductService productService;

    @Autowired
    private ObjectMapper om;

    @Test
    public void findAll_test() throws Exception {
    }

    @Test
    public void findById_test() throws Exception {
    }

}
