# 使用策略模式+工厂模式+模版模式 重构多个if-else代码

```java
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
```