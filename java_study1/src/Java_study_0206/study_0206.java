package Java_study_0206;

import java.util.Scanner;

public class study_0206 {

	public static void main(String[] args) {
		// for, while(반복)문 활용
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <=  3; i++) {
			for(int k = 1; k<= 2; k++) {
				System.out.println("i= " + i + "  k = " + k);
			}
		}
		
		int i1 = 1;
		while(i1 <= 3) {
			int k1 = 1;
			while (k1 <= 2) {
				System.out.println("i1 = " + i1 + "  k1 = " + k1);
				k1++;
			}
			i1++;
		}
		
		int a = 10;
		do {
			System.out.println("do ~ while문");
			a++;
		}while(a<15); // for 와 while 과 다르게 do while은 조건식 뒤에 ;을 붙혀야함
		
		/* 
		 * do while에 프로세스
		 * 초기값 확인 -> {내용} 실행 -> 조건식 비교 -> 참일결우 {내용} 실행 -> 증감 실행 -> 조건식 비교 -> 참일경우 {내용} 실행(거짓일때 까지 반복) 
		 */
 
		// 예제 : 가위바위보
		int user = 0;
		do {
			System.out.print("1.가위 2.바위 3.보 :");
			user = sc.nextInt(); 
		} while (!(user >= 1 && user <= 3));
		// 반복문의 조건식과 내용에 의해서 만들어진 데이터가 연관있다면 do while 을 사용하는 것을 생각해보아야함
	}

}
