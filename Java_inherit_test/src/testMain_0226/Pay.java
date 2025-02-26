package testMain_0226;

public abstract class Pay { // 결제방법 부모메서드
	
	protected int payMoney; // 결제금액
	protected String payDate; // 결제일

	public Pay() {};
	protected Pay(int payMoney, String payDate) {
		this.payMoney = payMoney;
		this.payDate = payDate;
	}
	
	
	public abstract void processPay();
	
	
}
