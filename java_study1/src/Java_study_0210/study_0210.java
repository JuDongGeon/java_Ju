package Java_study_0210;

import java.net.MulticastSocket;
import java.util.Scanner;

public class study_0210 {

	public static void main(String[] args) {
		// 반목문 활용 및 1차 배열

		
		Scanner sc = new Scanner(System.in);
		
//		문제 7. 알파벳 찾기(반복문 사용)
//		알파벳 (대문자 또는 소문자 모두 가능하게 입력) 입력
//		입력한 알파벳이 몇번째 알파벳인지 찾기 - 반드시
		
		System.out.print("알파벳 입력 : ");
		char alp = sc.nextLine().charAt(0); // 문자 입력 방법 스캐너이름.nextLine().charAt();

		// 아스키 코드에서 A - 65 (10진수), a - 97(10진수)
		for(int i = 1; i<=26; i++) {
			if (alp == (i+64) || alp == (i+96)) {
				System.out.printf("알파벳 %c 는 %d번째 알파벳 \n", alp, i);
				break;
			}
		}
		
		int a = 10;
		a = 20;
		// 배열 : 같은 데이터 타입의 연속적인 메모리 공간. 다른 말로 -> 변수공간 여러개를 연속적으로 사용
		
		//자바스크립트 배열 -> lat arr = []; let arr = new Array();
		//				  const arr = [1,2,3,4,5];

		// 자바 배열 선언 방법
		int [] arr = new int [5]; // 5개 공간으로 이루어진 배열 선언 -> 아직 데이터가 없음
		int [] arr2 = new int [] {1, 20, 50, 15}; // 중괄호안 데이터 개수만큼 배열이 만들어짐 -> {}안에 데이터가 입력됨
		
		
		// 자바 배열 사용법
		arr[2] = 20; // 배열이름 [맨앞에서 이동할 공간거리 ex)3번째 공간에 저장하려면 2로 이동해야함] = 데이터 값; 
		System.out.println(arr[2]);
		arr[0] = 10;
		arr[1] = 30;
		arr[3] = 40;
		arr[4] = 60;
		
		// 배열을 쓸 경우는 반복문 필수
		
		for(int i=0; i<=4; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i2 = 0; i2<=3; i2++) {
			System.out.println("arr2는 " + arr2[i2]);
		}
		
		
		/* 배열 인덱스 정리
		 * 배열의 각각의 공간을 표현하려면 인덱스로 표현해야한다.
		 * 인덱스는 0부터 시작한다
		 * 그래서 반복문의 초기값은 0으로 지정하면 된다
		 * 반복문의 조건식은 배열인덱스의 마지막까지 표현될 수 있게 하면된다
		 * ex) 배열의 크기(공간갯수)가 8이라면 마지막 인덱스는 7, 조건식은 i<=7로 표현
		 */

		// scanner 값같은 것들을 참조변수라 부르며, 혼자서는 아무것도 못함
		// 참조변수를 사용하려면 배열일 경우에는 인덱스로 표현, 객제인 경우는 .을 이용하여 표현
		// Scanner [] ab = new Scanner[50];
		// ab[0];
		// Scanner 라는 이름의 클래스 타입이다.
		
		int [] apple = new int [10];
		for (int i3 = 0; i3<=9; i3++) {
			System.out.print("숫자입력 : ");
			apple[i3] = sc.nextInt();
		}
		
		
		// 배열이름.length -> 배열의 크기(공간갯수)
		// 실수데이터는 정확도가 100%가 아니라 잘못 처리될 수 있다.
		// 배열의 크기는 반드시 10진수 정수로 지정
		
		for(int i4 = 0; i4 < apple.length; i4++) {
			System.out.println("배열값 : " +apple[i4]);
		}
		
	}

}
