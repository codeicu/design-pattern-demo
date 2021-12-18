package com.example.design;

import org.springframework.stereotype.Component;

@Component
public class WechatPayHandler extends AbstractPayHandler{

    @Override
    void execute() {
        System.out.println("wechat pay");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        PayFactory.register("wechat",this);
    }
}
