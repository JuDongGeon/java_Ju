package java_study_0214;

import java.util.Scanner;

public class java_hw_0214 {

	public static void main(String[] args) {
		// 250214 과제
		
		
		/* 문제
		 * 영화관 예약 사이트를 만든다고 할때, 영화관에 관별로 좌석수에 차이를 두어 만들어라
		 * 3관의 좌석수는 96(8줄 12열)개이다.
		 * 좌석이 예약완료된 곳은 1로 표시, 비어있으면 0으로 표시
		 * 
		 * 몇명 예약할 것인지 인원수를 입력하면 연속적으로 비어있는 자리로 지정하도록 설정
		 * 
		 * 마지막으로 몇번째 좌석이 예약 되었는지 출력
		 * 
		 */

		
		Scanner bk = new Scanner(System.in);
		
		
		// 스크린 만들기
		int [][]screen = new  int [][] {
			{0,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,0},
			{0,2,0,0,7,8,11,9,9,10,0,2,0},
			{0,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,6,0}
		};
		
		for(int i = 0; i < screen.length; i++) {
			for(int k = 0; k < screen[i].length; k++) {
				if(screen[i][k] == 0)
					System.out.printf("   ");
				if (screen[i][k] == 1)
					System.out.print("─");
				if (screen[i][k] == 2)
					System.out.print(" │ ");
				if (screen[i][k] == 3)
					System.out.print(" ┌");
				if (screen[i][k] == 4)
					System.out.print("┐ ");
				if (screen[i][k] == 5)
					System.out.print(" └");
				if (screen[i][k] == 6)
					System.out.print("┘ ");
				if (screen[i][k] == 7)
					System.out.print("S ");
				if (screen[i][k] == 8)
					System.out.print(" c ");
				if (screen[i][k] == 9)
					System.out.print(" e ");
				if (screen[i][k] == 10)
					System.out.print(" n");
				if (screen[i][k] == 11)
					System.out.print(" r ");
			} System.out.println();
		}; // 여기까지 스크린 만들기

		
		   // 좌석 만들기 
		int [][] cinema = new int [][] {
			{0,0,1,0,0,0,0,0,1,1,0,0},
			{0,0,0,0,0,0,0,0,1,0,0,0},
			{0,0,0,0,1,0,0,0,0,0,0,0},
			{0,1,1,0,0,0,0,0,0,1,1,1},
			{0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,1,1,0,0,0,0,0,1,0},
			{0,0,1,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,1,1,1,1,0,0,0}
		};
 		
		for(int i = 0; i < cinema.length; i++) {
			for(int k = 0; k < cinema[i].length; k++) {
				if(cinema[i][k] == 0)
					System.out.printf(" □ ");
				if (cinema[i][k] == 1)
					System.out.print(" ■ ");
			} System.out.println();		
		} // 여기까지 좌석만들기
		
		// 예약 입력만들기
		System.out.print("예약할 인원 수 : ");
		int booking = bk.nextInt();

		
		int cBooking = 0; 
		
		
		
		
		
	}

}
