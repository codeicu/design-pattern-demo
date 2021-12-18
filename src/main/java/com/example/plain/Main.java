package com.example.plain;

public class Main {
    public void pay(String payType) {
        switch (payType) {
            case "wechat":
                System.out.println("wc pay");
                break;
            case "alipay":
                System.out.println("ali pay");
                break;
            case "bank card":
                System.out.println("bank pay");
                break;
            case "cash":
                System.out.println("cash");
                break;
            default:
                System.out.println("error");
        }
    }
}
