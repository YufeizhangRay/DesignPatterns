package cn.zyf.design.pattern.strategy;

/**
 * 支付渠道
 */
public interface Payment {
	
	public PayState pay(String uid, double amount);
}
