package com.example.design;

import org.springframework.beans.factory.InitializingBean;

/**
 * 模版方法模式 + 策略模式
 */
public abstract class AbstractPayHandler implements InitializingBean {

    public void execute(){
        pre();
        pay();
        post();
    }

    void pre(){

    }

    void post(){

    }


    /**
     * 电子支付时的方法，不需要找钱
     */
    public void pay(){
        throw new UnsupportedOperationException();
    }

}
