package com.example.design;

public class Main {
    void pay(String payType){
        PayFactory.getInvokeStrategy(payType).execute();
    }
}