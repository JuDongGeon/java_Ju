package java_study_0124;

public class study_0124 {

	public static void main(String[] args) {
		// if 문 사용
		
		
		// 바이킹 탑승 - 키가 140이상만 탑승
		int tall = 163;
		// if문에는 조건식이 반드시 if 뒤에 붙어야함
		// 조건식은 (),그다음 {}에 조건에 따라 실행될 내용작성
		if(tall >= 140) {
			System.out.println("탑승가능");
			System.out.println("키가 140이상이다.");
			int a = 10;
			a = 132+2;	
		} else { // else는 조건식이 거짓일 경우 실행
			System.out.println("탑승불가");		
		}

		// 두 숫자 중 큰수는?
		int num1 = 35, num2  = 12;
		
		if(num1 > num2) {
			System.out.println(num1);
			
		} else {
			System.out.println(num2);
		}
		
		//철수와 민수 중 누구의 발이 더 큰가?
		int 철수 = 275, 민수 = 265;
		if (철수 > 민수) {
			System.out.println("철수가 발이 더 크다");
		} else {
			System.out.println("민수가 발이 더 크다");
		}
		
		
		// 편의점에서 도시락을 사먹는데, 가격이 5200원이다
		// 내 통장 잔액이 4530원이라면 얼마를 이체해야 하나?
		//(잔액이 충분하다면 이체할 필요없다.)
		int money = 4530;
		if (money >=5200) {
			System.out.println("결제가능");
		} else {
			System.out.println((5200 - money) + "원 이체 필요" );
			money += (5200-money);
			System.out.println("이체완료 및 결제 가능");
		}
		
		
		// 바이킹 탑승 조건 - 키가 140이상 190이하만 가능
		if(tall >= 140 && tall <= 190) {
			System.out.println("탑승 가능");
		} else {
			System.out.println("탑승 불가");
		}
		
		// 후룸라이드를 탑승조건이 키가 130이상 이거나 몸무게가 45kg 이상만 가능한 if문 작성.
		tall = 125;
		int wg = 35;
		if (tall<130 && wg < 45) {
			System.out.println("탑승 불가");
		} else {
			System.out.println("탑승 가능");
		}
		
		/* 이런 방식도 가능
		 if ( !(tall >= 130 || wg >= 45) {
			System.out.println("탑승 불가");
		} else {
			System.out.println("탑승 가능");
		}

		 */
		
		
		
		
		
		
	}

}
