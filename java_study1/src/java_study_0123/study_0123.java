package java_study_0123;

import java.util.Scanner;

public class study_0123 {

	public static void main(String[] args) {
		// 연산자 재정리 및 활용
		
		// 사칙연산자 : +, -, *, /, %
		// 복합연산자 : +=, -=, *=, /=, %=
		// -> a = a + 12; => a += 12;
		// 증감연산자 : ++, --
		// 비교연산자 : 비교연산자를 통해 조건식을 만든다. 조건식은 참 또는 거짓의 결과
		// -> ==(같다), !=(같지 않다)
		// 논리 연산자 : 논리연산자는 참이나 거짓을 가지고 연산한다.
		// -> &&(and), ||(or), !(not)
		// -> a > b && (b < 4 && b > 0 || c > 10) => b의 값이 0보다 크고 4보다 작거나 c의 값이 10보다 크면서 a가 b보다 큰 조건 
		
		// 조건연산자
		// (조건식) ? 참일 경우 실행 내용 : 거짓일 경우 실행 내용;
		// ex)
		// String result = (10 > 5) ? System.out.println("5보다 크다")" : System.out.println("5보다 작다");
		// String result = (10 > 5) ? "5보다 크다" : "5보다 작다";
		// System.out.println(result);
		
		// Scanner bus = new Scanner(System.in);
		
		// int age = 16;
		// System.out.print("나이 :");
		// age = bus.nextInt();
		// int price = (age < 19) ? 1000 : 1500;
		
		// System.out.printf("나이 : %d살, 버스요금 : %d원 \n", age, price);
		
	
		
		// System.out.print("첫 번째 숫자 : ");
		// int num1 = scan.nextInt();
		// System.out.print("두 번째 숫자 : ");
		// int num2 = scan.nextInt();
	
		// int res = (num1 > num2) ? num1 : num2;
		// 조건식이 참이라면 res = num1 수행
		// 조건식이 거짓이라면 res = num2 수행
		
		// System.out.println("두 숫자 중 큰 숫자는 : " + res);
		
		
		// 두 숫자를 입력받아서 두 수가 같다, 같지않다. 출력
	
		// System.out.print("1번 숫자 : ");
		// int num3 = scan.nextInt();
		// System.out.print("2번 숫자 : ");
		// int num4 = scan.nextInt();
		
		// String ox = (num3 == num4) ? "같다." : "같지 않다.";
		// System.out.println("두 숫자는 같은가 ? " + ox);
	
		
		
		Scanner scan = new Scanner(System.in);	
		
//		System.out.print("정수 입력 : ");
//		int num = scan.nextInt();
//		
//		
//		// 입력한 정수가 양수냐 음수냐 0이냐
//		String result = (num > 0) ? "양수" : (num == 0) ? "0" : "음수";
//		System.out.println(result);
//		
//		
//		// 바이킹을 타기 위해서는 키가 135 이상이어야 합니다.
//		// 바이킹 탑승여부를 출력하세요.
//		
//		System.out.print("키 입력 : ");
//		int tall = scan.nextInt();
//		
//		String OX = (tall >= 135) ? "탑승가능" : "탑승불가";
//		System.out.println("탑승가능여부 : " + OX);
//		
//		System.out.print("1. 파미향 2. 쿠겐 돈까스 3. 공주순대 : ");
//		int select = scan.nextInt();
//		
//		int price = (select == 1) ? 9000 : 0;
//		price = (select == 2) ? 8000 : price;
//		price = (select == 3) ? 6500 : price;
//		
//		System.out.println("가격은 " + price + "원 입니다.");
		
		
		// 예제
		// 정수 세 개를 키보드를 통해 입력받기
		// 세 정수 중 가장 큰 정수를 출력하세요.(같은 경우는 제외)
		
//		System.out.print("첫번째 정수 : ");
//		int num1 = scan.nextInt();
//		System.out.print("두번째 정수 : ");
//		int num2 = scan.nextInt();
//		System.out.print("세번째 정수 : ");
//		int num3 = scan.nextInt();
		
//		int big = (num1 > num2 && num1 >num3) ? num1 : (num2 > num1 && num2 >num3) ? num2 : num3;
//		System.out.println("가장 큰 수는? " + big);
		
		System.out.print("세 정수 입력 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int max = (num1 > num2) ? num1 : num2;
		max = (max > num3) ? max : num3;
		System.out.println("가장 큰 수 : " + max);
		
		
	}
	

}
