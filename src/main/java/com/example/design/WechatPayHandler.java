package com.example.design;

public class WechatPayHandler extends AbstractPayHandler {

    @Override
    public void pay() {
        System.out.println("wechat pay");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        PayFactory.register("wechat",new WechatPayHandler());
    }
}
