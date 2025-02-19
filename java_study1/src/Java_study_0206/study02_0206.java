package Java_study_0206;

import java.util.Scanner;

public class study02_0206 {

	public static void main(String[] args) {
		// 문제풀기

		Scanner ex = new Scanner(System.in);

		/* 무한루프
		 *  정수 한개씩 계속 입력 받으면서 입력하다가 0을 입력하면 지금까지 입력한 모든 수작의 합 출력
		 */

		int num = 0;
		int sum = 0;
		
		do {
			System.out.print("정수 입력 : ");
			num = ex.nextInt();
			sum += num;
		} while (num > 0 || num < 0);

		System.out.println("총합 : " + sum);
		
		/* 무한루프 2
		 * 컴퓨터와 가위바위보 게임하기
		 * 개가 10번을 이길때까지 계속하기
		 * 10번을 이기면 그동안 몇번을 패배하고 비겼는지 출력
		 */
		int user = 0;
		int win = 0;
		int drow = 0;
		int lose = 0;

		do {
			
			System.out.print("1.가위 2.바위 3.보 : ");
			user = ex.nextInt();
			int com = (int)(Math.random()*3+1);

			switch (user - com) {
			case 1 : 
				System.out.println("이김");
				win++;
				break;
			case -2 :
				System.out.println("이김");
				win++;
				break;
			case 0 : 
				System.out.println("비김");
				drow++;
				break;
			case -1 : 
				System.out.println("짐");
				lose++;
				break;
			case 2 : 
				System.out.println("짐");
				lose++;
				break;
			}
			
			if (win == 10) {
				System.out.println("10회 승리하셨습니다.");
				break;
			}
			
		} while (user >= 1 && user<=3);
			System.out.println("비긴횟수 : " + drow + "  진 횟수 : " + lose);
			
			
		/* 문제 3
		 * 컴퓨터와 주사위 게임을 한다 각각 주사위를 던져서 주사위 합이 큰쪽이 이긴다
		 * 단 주사위가 같은 숫자라면 합이 작아도 이긴다.
		 * 둘다 같은 숫자가 나오면 합이 큰쪽이 이긴다.
		 * 5판 진행시 몇승 몇무 몇패인지 출력
		 */
			
		int user1 = 0, user2 = 0;
		int com1 = 0, com2 = 0;
		int W=0, L=0, D=0;
		
		for (int game = 0; game <= 5; game++) {
			user1 = (int)(Math.random()*6+1);
			user2 = (int)(Math.random()*6+1);
			com1 = (int)(Math.random()*6+1);
			com2 = (int)(Math.random()*6+1);
			
			
			if ((!(user1 == user2)) && (!(com1 == com2))) {
				if ((user1+user2) >= (com1+com2)) {
					System.out.println("이겼다");
					W++;
				}
				if ((user1+user2) <= (com1+com2)) {
					System.out.println();
				}
			
				
			}
			
			
		}
			
			
	}
}

		
		
		
		
		

		
		


