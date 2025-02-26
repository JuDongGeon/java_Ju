package testMain_0226;

public class Cash extends Pay {
	
	public Cash(int payMoney, String payDate) {
		super(payMoney, payDate);
	}
	
	@Override
	public void processPay() {
		System.out.println("현금 결제금액 : " + payMoney + "원");
	}
}
