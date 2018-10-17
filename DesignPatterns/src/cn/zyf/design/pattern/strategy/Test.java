package cn.zyf.design.pattern.strategy;

public class Test {

	public static void main(String[] args) {

        Order order = new Order("1","20181017",999.99);

        //开始支付，选择微信支付、支付宝
        //每个渠道它支付的具体算法是不一样的
        //基本算法固定的

        System.out.println(order.pay(PayType.WECHAT_PAY));
    }
}
