package java_study_0122;

import java.util.Scanner;

public class study3_0122 {

	public static void main(String[] args) {

		
		// 비교 연산자 - 두 개 데이터를 비교하여 참, 거짓 결과

		System.out.println(10>5);
		System.out.println(11<4);
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		
		System.out.println("5보다 큰 숫자인가? " + (num>5));
		boolean big;
		big = num >= 10;
		
		System.out.println("10 이상인가? " + big);
		
		System.out.println(10==10);
		System.out.println(10==13);
					
		String word="가나다";
		String word2= new String ("가나다");
		System.out.println(word. equals (word2));
		System.out.println('a'>'b');
		// == 비교연산자는 비교하는 2개의 값이 같은 자료형인지 판별
		
		System.out.println(10 != 5);
		
		// 놀이공원에 가서 바이킹을 타는데 140이상만 탈 수 있다.
		int tall;
		System.out.println("키 : ");
		tall = scan.nextInt();
		System.out.println(tall >= 140);
		
		
		// 바이킹 탑승 조건 : 키 140이상 190이하
		// 비교연산자로 만들어진 조건식이 여러 개인 경우 논리연산자를 사용
		System.out.println(tall >=140 && tall <= 190);
		
		// 140 <= tall <= 190
		// System.out.println(140 <= tall <= 190);
		// 비교 데이터 타입 불일치로 오류발생
		
		
		// 청소년 버스요금은 1000원이다.(청소년은 13세부터 19세)
		// 나이를 입력 받아서 청소년이면 false 아니면 true가 출력 되게 하세요
		int age = 0;
		System.out.println("나이 입력 :");
		age = scan.nextInt();
		System.out.println(age<13 || age>19);
		
		// 조건식 : 비교연산자와 논리연산자를 이용하여 만든식 
		// 조건식을 만드는 연습을 해야한다.
		// total > count
		
		
	}

}
