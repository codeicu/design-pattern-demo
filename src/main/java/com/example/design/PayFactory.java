package com.example.design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PayFactory {
    private static Map<String, AbstractPayHandler> map = new ConcurrentHashMap();

    public static AbstractPayHandler getPayHandler(String payType) {
        AbstractPayHandler abstractPayHandler = map.get(payType);
        if (abstractPayHandler == null) {
            throw new RuntimeException();
        }
        return abstractPayHandler;
    }

    public static void register(String payType, AbstractPayHandler payHandler) {
        checkArgs(payType, payHandler);
        map.put(payType, payHandler);
    }

    private static void checkArgs(String payType, AbstractPayHandler payHandler) {
        if (payHandler == null) {
            throw new RuntimeException();
        }
    }
}
