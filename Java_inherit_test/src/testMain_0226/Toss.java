package testMain_0226;

public class Toss extends Pay {
	
	public Toss(int payMoney, String payDate) {
		super(payMoney, payDate);
	}
	
	@Override
	public void processPay() {
		System.out.println("계좌이체 금액 : " + payMoney + "원");
	}
	
}
