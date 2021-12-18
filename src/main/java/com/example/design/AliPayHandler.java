package com.example.design;

public class AliPayHandler extends AbstractPayHandler {

    @Override
    public void pay() {
        System.out.println("ali pay");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        PayFactory.register("ali",new AliPayHandler());
    }
}
