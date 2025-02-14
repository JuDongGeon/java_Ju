 package java_study_0122;

import java.util.Scanner;

public class study_0122 {

	public static void main(String[] args) {
		// 연산자 우선순위와 활용(사칙,복합)
		
		int num = 20; // 대입 연산자에 의해 오른쪽 값을 왼쪽 변수에 저장
		num = 20 + 3 + 1*10; // +, * 연산후 대입 연산 실행
		int num2 = 10, num3 = 55; // ,를 이용하여 선언 가능
		num = num2 + 13 / num3 +123; // 대입 연산자는 다른 연산자들보다 우선순위가 낮다.
		
		/*
		 * 연산자 순위
		 * 1. ()
		 * 2. []
		 * 3. .
		 * 4. ->
		 * 5. 이후 나옴(일단 위에만 기억)
		 */

		// 사칙연산자 예시
		System.out.println(num2 + num3);  // +
		System.out.println(num3 - num2);  // -
		System.out.println(num2 * 4);  // *
		System.out.println(num2 + num3*2);  // + 연산후 + 연산
		System.out.println(num3 / num2);  //  / 연산은 몫
		System.out.println(num3 % 4);  // % 연산은 나머지
		System.out.println(10 / 3.0); // 정수와 실수 계산은 실수로 출력됨
		System.out.println(10 % 3.0);
		
		
		// 복합 대입 연산자 => 왼쪽 변수와 오른쪽 연산전 변수값이 동일해야함 ex) num = num (사칙연산자) 연산값; => num (사칙연산자) = 연산값;
		num = 10;
		num += 20; //num = num + 20; 이랑 같은 의미
		
		
		Scanner scan = new Scanner(System.in);
		
		// 원으 둘레 구하기
		int r = 0, dist = 0;
		System.out.print("반지름 : ");
		r = scan.nextInt();
		
		dist = (int)(r * 2 * 3.14);
		
		System.out.println(" 원의 둘레 : " + dist);
		
		
		
	}

}
