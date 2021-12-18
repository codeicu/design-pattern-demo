package com.example.design;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MainTest {

    @Test
    @DisplayName("test wechat pay")
    void pay() {
        PayFactory.getPayHandler("wechat").pay();
    }

    @Test
    @DisplayName("调用不存在的支付方式")
    void payError() {
        assertThrows(Exception.class, () -> {
            PayFactory.getPayHandler("we").pay();
        });
    }
}