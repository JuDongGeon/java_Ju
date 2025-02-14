package java_study_0131;

import java.util.Scanner;

public class study_0131 {

	public static void main(String[] args) {
		// if 문제풀이
		
		Scanner in = new Scanner(System.in);
		
		float 실수변수 = 10;
		
		int 나이 = 10;
		if (나이>=19) {System.out.println("성인입니다.");
		}else {
			System.out.println("청소년입니다.");
		}
		
		int money = 6400;
		if(money >= 10000)
			System.out.println("충전안함");
		else {
			System.out.println("잔액 부족 " + (10000-money) + "원 충전");
			money = (10000 - money) + money;
		}
		
		System.out.println("현재잔액 : " + money);
		// if 문에서 출력되어야하는 것 중 중복되는 것은 if 문 바깥으로 뺴서 줄을 간소화 할 수 있음
		// if 문에서 중괄호 안에 실행되는 내용이 한개 밖에 없다면 굳이 중괄호를 안써도된다.
		
		
		//예제
		// 사각형의 너비와 높이이다. 현재 사각형은 정사각형인지 직각 사각형인지 출력해라
		int width = 53, height = 54;
		if (width==height) {
		System.out.println( "정사각형입니다.");
		} else {
			System.out.println("직각사각형입니다.");
		}
		
		//예제 2 num의 입력한 값이 짝수인지 홀수인지 입력하기
		int num = 0;
		
		System.out.print("숫자입력 : ");
		num = in.nextInt();
		
		if (num%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		int 숫자 = 15;
		if (숫자 > 0) {
			System.out.println("양수이다.");
		} else if (숫자 < 0) {//조건식과 연관성이 있을때 사용하며, 꼭 else로 마무리 되는건 아님
			System.out.println("음수이다");
		} else {
			System.out.println("0이다.");
		}
		
		int score = 81; // 100 ~ 90은 A, 89 ~ 80은 B, 79 ~ 70은 C, 나머지는 F
		if(score <= 100 && score >= 90) {
			System.out.println("A학점입니다.");
		}
		else if(score <= 89 && score >= 80) {
			System.out.println("B학점입니다.");
		}
		else if(score <= 79 && score >= 70) {
			System.out.println("C학점입니다.");
		} else {
			System.out.println("F학점입니다");
		}
		
		
		// 예제
		// 1입력하면 데이터 저장이라고 출력, 2입력하면 데이터 삭제, 3을 입력하면 종료, 앞에 숫자 제외 숫자는 error라고 출력되도록 만드세요
		int 명령 = 0;
		System.out.print("명령입력 : ");
		명령 = in.nextInt();
		if (명령 == 1) {
			System.out.println("데이터 저장");
		} else if(명령 == 2) {
			System.out.println("데이터 삭제");
		} else if(명령 == 3) {
			System.out.println("종료");
		} else {
			System.out.println("ERROR");
		}
		
		
		
	}

}

/*
		변수 : 데이터(값)를(을) 저장하기 위한 메모리 공간
		변수이름 : 데이터가 저장된 메모리 공간을 사용하기 위해서는 이름을 부여 해야한다.
		System.out.println(1000);
		int a = 1000;
		
		변수 선언 : 데이터 타입 정하기, 변수 이름 정하기
			-> 데이터 타입을 입력할 데이터에 맞춰서 정하기
			-> 변수이름은 한글 영어 이태리어 다상관없지만 만국공통 영어가 제일 편함
			-> ex) int num; => 데이터타입 : int,  이름 : num
		
 		* 사람의 언어를 컴퓨터가 실행하는 과정을 '컴파일'과정이라고 함 
		
		데이터 타입 변환(형변화)이란
		자동 형변환 : 데이터 타입이 작은 범위에서 큰 범위로 자동 변환되는 것
		-> ex) float num = 10; => 데이터 타입은 실수, 입력된 데이터는 정수로 타입에 범위가 입력값보다 범위가 넓어 자동형변환됨
		강제 형변환 : 데이터 타입이 큰 범위에서 작은 범위로 강제로 변환시키는것
		-> int b = (int) 2.15f => 데이터 타입은 정수, 입력된 값은 실수로 타입에 범위가 입력값보다 범위가 작음. 그래서 (int)를 통해 입력값을 강제로 정수값으로 변환시킴. 여기서 값은 소수들이 제외됨. 데이터끼리뿐만 아니라 클래스도 포함
		 
		나누기 /는 몫 구하기, 나누기 %는 나머지 구하기
		++, -- : 증감연산자(1씩 증가, 1씩 감소) 

		if 문 만들기
		if(조건식) { 조건식이 참이라면 조건식 다음의 중괄호 안에 내용만 실행 
			참일 경우 실행할 내용, 여러줄 가능
		
		} else {else는 조건식이 거짓일 경우에만 실행
			거짓일 경우 실행할 내용, 여러줄 가능
			
			// eles는 선택사항으로 if만 사용하여 할수 있음
		}
		 
		
 */