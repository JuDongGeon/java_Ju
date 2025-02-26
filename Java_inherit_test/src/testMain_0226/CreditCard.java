package testMain_0226;

public class CreditCard extends Pay {

	public CreditCard(int payMoney, String payDate) {
		super(payMoney, payDate);
	}
	
	@Override
	public void processPay() {
		System.out.println("신용카드 결제금액 : " + payMoney + "원 결제일 : " + payDate);
	}
	
}
