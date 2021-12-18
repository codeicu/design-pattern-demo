package com.example.design;

import org.springframework.beans.factory.InitializingBean;

public abstract class AbstractPayHandler implements InitializingBean {
    void pre(){
        System.out.println("pre check");
    }
    void pay(){
        pre();
        execute();
        post();
    }
    void post(){
        System.out.println("post check");
    }

    void execute(){

    }

}
