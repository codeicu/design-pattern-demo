package com.example.design;

import org.springframework.stereotype.Component;

@Component
public class AliPayHandler extends AbstractPayHandler{

    @Override
    public void afterPropertiesSet() throws Exception {
        PayFactory.register("ali",this);
    }
}
