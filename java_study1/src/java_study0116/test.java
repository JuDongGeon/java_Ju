package java_study0116;

public class test {

	public static void main(String[] args) {
		// 자바 기본설명  
		
		//25.01.16 
		// 한줄 주석 - 설명이나 메모, 코드 대기 등등 
		/* 
		 * 여러줄 주석 - 주석은 프로그램 실행 안하는 부분
		 * 주석 안에 백날 천날 코드를 작성한들 작성 안된다. 각 코드의 설명을 작성하는 용도로 사용하면 됨
		 * 
		 * 단축키
		 * ctrl + s 저장
		 * ctrl + / 주석
		 * ctrl + f11 실행 
		 * 
		 */
		System.out.println("자바 이클립스 테스트");
		
		int age;
//		데이터를 사용하려면 변수를 선언해야한다.
//		변수는 의미가 있는 영단어가 좋음, 저장하고자 하는 데이터 타입 기입-> 변수는 데이터타입 이름 순으로 적어야함
		
		/*
		 * 기본 데이터 타입
		 * 정수 : byte, short, int, long (작은 순)
		 * 실수 : float, double
		 * 문자 : char
		 * 참/거짓 : boolean
		 */
		
		age=100;
//		대입연산 저장하는 방법, 오른쪽 데이터를 왼쪽 변수에 저장시킴
//		똑같은 변수에 새로운 대입연산을 하면 덮어쓰기됨->기존 자료 정보로는 더이상 찾기 불가
		age='가';  // 자바에서 ''표현은 문자, ""표현은 문자열
		
		
		//25.01.17
		
		// 정수 타입
		int num2 = 20; //변수를 선언하면서 저장 - 변수 초기화라고 부름
		int num3 = 43;
		//num3은 43이다라고 하는게 아닌 num3dp 43을 저장했다 혹은 대입했다라고 표현->num3에 새로운 값을 입력하면 새로운 수가 저장되기때문에 그렇게 표현
		
		System.out.println( num2 + num3);
		//ctrl + spece bar 자동입력 명령어?
		int sum = num2+num3;
		System.out.println(sum);
		
		//ex) 사각형의 너비와 높이 값으로 넓이를 구하세요.
		int width;
		int height;
		width = 20;
		height = 32;
		int area = width * height;
		System.out.println(area);
		
		//예제
		int blue = 20;
		int red = 15;
		int white =0;
		System.out.println(blue);
		System.out.println(red);
		
		//예제문
		//파란컵에 오렌지주스가 20ml있다.
		//빨간컵에 딸기주스가 15ml가 있다.
		// 파란컵에 딸기주스를 빨간컵에 오렌지주스를 담으려면 어떻게 해야하는가?

		white = blue;
		blue = red;
		red = white;
		System.out.println(blue);
		System.out.println(red);
		
		//예제
		int birthYear = 1991;
		// 김첨수가 태어난 년도를 birth_year에 저장했다.
		// 나이는?
		
		int kcsAge = 2025 - birthYear;
		
		System.out.println(birthYear);
		System.out.println(kcsAge);
		
		// 변수란 데이터(값)을 저장할 수 있는 메모리 공간
		// 변수의 공간에는 데이터 타입에 맞는 데이터만 저장할 수 있게 해줘야한다.
		// 변수이름은 카멜 표기법이 일반적이다.
		// 변수이름은 변수의 사용목적에 맞는 이름으로 한다.(길어도 됨)
		
		// 실수 타입
		float fnum = 2.156f;
		// float 사용 시 실수값 뒤에 f를 붙혀야함
		System.out.println(fnum);
		fnum = 2.123456789f;
		System.out.println(fnum);
		//float은 소수 7자리까지 보임
		double dnum = 1.1234567890123456789;
		System.out.println(dnum);
		// double은 소수 16자리까지 보이며, 17번째 자리에서 올림 처리됨
		
		// 문자 타입
		char ch = 'a';
		System.out.println(ch);
		ch = '가';
		System.out.println(ch);
		ch = 97;
		System.out.println(ch);
		ch = 'H';
		System.out.println(ch - 'A');
		System.out.println( ch  - 'A');
		System.out.println('가'- 64);
		//문자열은 String 클래스 타입 사용, 기본 데이터 타입X ex) String name="홍길동";
		
		// 참/거짓 값을 가지는 타입 
		boolean isApple = true; 
		System.out.println(isApple);
		
		//과제 
		
	} 

}