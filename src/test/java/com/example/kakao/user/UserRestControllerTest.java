package com.example.kakao.user;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.kakao._core.advice.ValidAdvice;
import com.fasterxml.jackson.databind.ObjectMapper;

@Import({ ValidAdvice.class }) // webmvc가 ioc에 올려주지 않는 것을 직접 로딩하기
@EnableAspectJAutoProxy // aop 활성화
@WebMvcTest(UserRestControllerTest.class) // f - ds - uc
public class UserRestControllerTest {

    @Autowired
    private MockMvc mvc; // 컨트롤러 요청 객체

    @MockBean

    @Autowired
    private ObjectMapper om;

    @Test
    public void join_test() throws Exception {
    }

    @Test
    public void login_test() throws Exception {
    }

}
