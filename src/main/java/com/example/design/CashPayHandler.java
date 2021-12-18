package com.example.design;

public class CashPayHandler extends AbstractPayHandler {

    @Override
    public void afterPropertiesSet() throws Exception {
        PayFactory.register("cash",new CashPayHandler());
    }
}
