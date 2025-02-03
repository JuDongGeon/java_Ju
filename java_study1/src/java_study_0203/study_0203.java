package java_study_0203;

import java.util.Scanner;

public class study_0203 {

	public static void main(String[] args) {
		// Math.random() -> 랜덤 사용해보기
		
		Scanner sc = new Scanner(System.in);
		
//		int num = (int)(Math.random()*10) ; // 난수(랜덤)을 발생시킴. 1일 안되는 소수의 랜덤 값 추출
//		System.out.println(num);
		
		// 랜덤값의 범위 정하는 방법
		// r*(큰범위값+1-작은범위값)+작은범위값
		// ex1) 랜덤 범위 : 4 ~ 12 => r*9(12(큰범위)+1-4(작은범위))+4(작은범위)
		// ex2) 랜덤 범위 : 37 ~ 121 = > r*85(121(큰범위)+1-37(작은범위))+37(작은범위
		
//		int user=0, coin = 0;
//		System.out.print("1.앞면, 2.뒷면 : ");
//		user = sc.nextInt();
//		coin = (int)(Math.random()*2+1);
//		
//		if (coin == user) {
//			System.out.println("WOW~! 맞췄어요~!");
//		} else {
//			System.out.println("아까워요~ 다시 도전하실래요?");
//		}
	
		
		// 예제
		// 컴퓨터가 동전을 15개 가지고 있다. 컴퓨터가 제시한 동전 갯수가 짝인지 홀인지 맞추는 게임을 만드세요
		// 1. 짝 2. 홀
//		int user = 0, coin =0;
//		System.out.print("1.짝수 2.홀수 : ");
//		user = sc.nextInt();
//		coin = (int)(Math.random()*15+1);
//	
//		if (user == (coin%2+1)) {
//			System.out.println("정답입니다");
//		} else {
//			System.out.println("오답입니다.");
//		}
		
		
		// 주사위게임
		// 컴퓨터가 주사위를 던졌다. 주사위 값이 3이하라면 작은값, 주사위 값이 4이상이라면 큰값이다.
		// 1.작다 2.크다
		// 주사위 값이 작은지 큰지 맞춰라
		
		int me = 0, dice= 0;
		System.out.print("1.작다 2.크다 :");
		me = sc.nextInt();
		dice = (int)(Math.random()*6+1);
		
		if (me == 1 || me ==2) {
			if (dice <= 3 && me == 1)
				System.out.println("작은 값 정답");
			else  if(dice >= 4 && me ==2)
				System.out.println("큰값 정답");
			else
				System.out.println("오답");
		}else
			System.out.println("잘못입력했습니다.");
		
		
	}

}
