package study_java0120;
//필수적인 클래스 경로
import java.util.Scanner;

public class study_java_0120 {

	public static void main(String[] args) {
		
		//250117 과제 풀이
		int 한개피단축 = 2;
		int 일년 = 365;
		int 흡연기간 = 20;
		int 하루흡연량 = 5;
		
		int 단축수명 = 하루흡연량 * 한개피단축 * 일년 * 흡연기간;
		int 단축수명시간 = 단축수명 / 60;
		int 단축수명일 = 단축수명시간 / 24;
		
		System.out.println("총 단축수명(분) : " + 단축수명);
		System.out.println("총 단축수명(시) : " + 단축수명시간);
		System.out.println("총 단축수명(일) : " + 단축수명일);
		// 문자열 "" 과 + 를 이용하여 간단한 내용 설명 가능
		
		/* 
		 * 변수 - 데이터를 저장하기 위한 메모리 공간
		 * 변수의 이름 - 데이터가 저장된 공간을 사용하기 위해 부여한 별명
		 * 변수 선언 방법 - 데이터타입 변수 이름 (예 - int num;)
		 * 저장할 데이터에 맞는 데이터타입을 설정해야한다.
		 * 변수이름의 첫 글자는 문자로, 자바 예약어는 사용불가(out 같은거)
		 */
		
		// 자바에서 결과로 출력하는 방법
		System.out.println("출력하는 방법");
		/*
		 * 자바에서 키보드를 통해 데이터를 입력하는 방법
		 * 자바에서 입력하기 위한 순서
		 * 1. 입력 객체 생성
		 * 2. 입력 객체를 통해 데이터에 맞는 입력 메서드 호출-> 
		 */
		
		// Scanner 변수이름 = new Scanner(System. in)
		Scanner input = new Scanner(System. in);
		
		// num 이라는 변수에 정수 데이터 입력하여 저장하기
		// nextInt()거 정수 데이터 입력 하기 위한 메서드이다.
		System.out.print("정수 입력 : ");
		int num = input.nextInt();
		System.out.println("입력 잘되었나? : " + num);		
				
		
		int oneAppleBox = 20;
		int oneOrangeBox = 15;
		int appleBox = 11;
		int orangeBox = 12;
		int totalApple = oneAppleBox * appleBox;
		int totalOrange = oneOrangeBox * orangeBox;
		int totalFruit = totalApple + totalOrange;
		System.out.println("총 과일 개수 : "+ totalFruit);
		
		
		
	
			}

}
