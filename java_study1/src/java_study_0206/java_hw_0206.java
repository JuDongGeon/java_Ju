package java_study_0206;

import java.util.Scanner;

public class java_hw_0206 {

	public static void main(String[] args) {
		// 2/4, 2/5 결석으로 해설만 함

		Scanner scan = new Scanner(System.in);
		
		System.out.println("==== UP & DOWN 게임(컴퓨터버전) ====");
		System.out.print("1 ~ 50 중 하나 입력 : ");
		
		int number = scan.nextInt();
		
		int max = 50, min = 1, t = 50;
		// max는 처음 범위에 최대값, min은 범위에 최소값, 변수 t 는 random()뒤에 곱해지는 값을 의미
		
		while(true) {
			System.out.println("범위 : " + min + " ~ " + max);
			int com = (int)(Math.random()*t + min);
			System.out.println("컴퓨터 : " + com);
			if(number == com) {
				System.out.println("정답입니다.");
				break; //while(반복문) 종료				
			}
			if (number > com) {
				System.out.println("UP");
				min = com + 1; // 업일 경우 범위에 최대값이 변경됨 => 입력값 + 1
				t = max - com; // 범위의  최대값 - 최소값 + 1 또는 범위의 최대값 - 입력값으로 해도됨 => 결과적으로 *뒤에 값을 구할 수있 음
			}
			if  (number < com) {
				System.out.println("DOWN");
				max = com - 1; // 다운일 경우 범위의 최대값이 변경됨 => 입력값 - 1
				t = max - min + 1; // 범위의 최대값 - 최소값 + 1하면 *뒤에 값이 나옴
			}
		}
	}
}
