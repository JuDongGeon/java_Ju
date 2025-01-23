package java_study_0123;

import java.util.Scanner;

public class study_0123 {

	public static void main(String[] args) {
		
		
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
		String result = (10 > 5) ? "5보다 크다" : "5보다 작다";
		System.out.println(result);
		
		Scanner bus = new Scanner(System.in);
		
		int age = 16;
		System.out.print("나이 :");
		age = bus.nextInt();
		int price = (age < 19) ? 1000 : 1500;
		
		System.out.printf("나이 : %d살, 버스요금 : %d원 \n", age, price);
		
		
	
	}

}
