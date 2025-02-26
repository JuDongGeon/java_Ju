package testMain_0226;

public class CheckCard extends Pay {

	public CheckCard(int payMoney, String payDate) {
		super(payMoney, payDate);
	}
	
	@Override
	public void processPay() {
		System.out.println("체크카드 결제금액 : " + payMoney + "원 결제일 : " + payDate);
	}
}
