package com.example.design;

import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PayFactory {
    private static Map<String, AbstractPayHandler> strategyMap = new ConcurrentHashMap<>();

    public static AbstractPayHandler getInvokeStrategy(String str) {
        return strategyMap.get(str);
    }

    public static void register(String str, AbstractPayHandler handler) {
        if (StringUtils.hasText(str) || null == handler) {
            return;
        }
        strategyMap.put(str, handler);
    }
}
