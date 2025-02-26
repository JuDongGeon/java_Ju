package testMain_0226;

public class MainMethod {

	public static void main(String[] args) {
		/*
		 실전 문제 1.
		 
		 원, 사각형, 삼각형 도형을 그린다.
		 도형의 크기를 지정하여 draw 메서드로 그리기를 수행한다.
		 
		 상송관계로 알맞은 클래스들을 정의하여 원, 삼각형, 사각형이 그려질 수 있도록 하시오
		 draw 메서드의 내용은 다음과 같다.
		 예를 들면 원이라는 클래스의 객처로 draw 를 실행한다면
		 System.out.println("지름이 " + width  + "인 원을 그린다.");

		 */
		
		System.out.println("실전 문제 1.");
		
		Circle c = new Circle(10,0);
		Square s = new Square(10,10);
		Triangle t = new Triangle(5,10);
		
		c.drow();
		s.drow();
		t.drow();
		
		/*
		 실전 문제 2.
		 
		 결제 방법에 대하여 나타낸다.
		 결제 방법은 총 신용카드, 체크카드, 현금, 계좌이체 4가지
		 공통변수는 결제금액과 결제일
		 부모 자식간의 상속관계를 만들고
		 "신용카드 결제금액 : 45000원 결제일 : 25.02.26" 형식으로 만들기
		 */
		System.out.println("");
		System.out.println("실전 문제 2.");
		
		CheckCard check = new CheckCard(30000,"25.02.26");
		CreditCard credit = new CreditCard(500000,"25.03.10");
		Toss toss = new Toss(322400,"25.02.26");
		Cash cash = new Cash(23400,"25.02.23");
		
		check.processPay();
		credit.processPay();
		toss.processPay();
		cash.processPay();
		
		
	}

}
