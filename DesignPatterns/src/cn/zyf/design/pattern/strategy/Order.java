package cn.zyf.design.pattern.strategy;

public class Order {
	private String uid;
	private String orderId;
	private double amount;

	public Order(String uid, String orderId, double amount) {
		this.uid = uid;
		this.orderId = orderId;
		this.amount = amount;
	}
	
	public String getUid() {
		return uid;
	}



	public void setUid(String uid) {
		this.uid = uid;
	}



	public String getOrderId() {
		return orderId;
	}



	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public PayState pay(PayType payType) {
		return payType.get().pay(this.uid, this.amount);
	}

}
