package java_study_0204;

import java.util.Scanner;

public class study_0204 {

	public static void main(String[] args) {
		// for(반복)문 사용
		
		for(int i = 1; i<= 10; i += 2) {
			System.out.println(i);
		}

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		
		for (int i1 = num; i1>= 1; i1--) {
			System.out.println("감소 반복!");
		}
		
		System.out.print("숫자 입력 : ");
		int num1 = scan.nextInt();
		
		for (int i2 = 1; i2 <= num1; i2++) {
			System.out.println("증가 반복!");
		}
		
		// for 문을 만드는 방법
		// for를 입력 후 조건식 (){}순으로 입력
		// ()안에는 우선 시작한 값 설정 ex) int i = 3 => i 값을 3부터 시작한다는 의미
		// 두번쨰로 범위 설정 ex) i <=(또는 >=, <, > 다 상관없음) num (값을 넣어도 설정해도 되고 입력값을 받아와도 됨) => num 보다 i값이 작으면 실행
		// 마지막으로 i의 증감을 표시 ex) i++(또는 i += 1)
		
		
	}

}
                                               