package com.tut;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.springframework.boot.autoconfigure.data.redis.RedisProperties.Jedis;

public class SessionControllerTest {

    private Jedis jedis;
    private TestRestTemplate testRestTemplate;
    private TestRestTemplate testRestTemplateAuth;

    @BeforeEach
    public void beforeEach() {
        this.testRestTemplate = new TestRestTemplate();
        this.testRestTemplateAuth = new TestRestTemplate();
    }
}
