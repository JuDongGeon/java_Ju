package Java_study_0211;

import java.util.Arrays;
import java.util.Scanner;

public class java_hw_0211 {

	public static void main(String[] args) {
		
		// 250211 과제
		
//		/*5줄 빙고판 만들기
//		 * 중복으로 숫자가 들어가지 않는 5*5 빙고판 만들기
//		 * 5줄 빙고가 되었을때 게임이 끝나도록 빙고판 만들기
//		 * 기본틀은 study02_0211 클래스 파일 팜고
//		 */
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int [] bingo = new int [25]; // 빙고 배열
//		int num = (int)(Math.random()*50+1);
//		
//		for(int i = 0; i <= 4; i++) {//빙고판 출력
//			for (int k = 0; k <= 4; k++) {
//				if(bingo[i*5+k] == 0)
//					System.out.printf(" %2s ", "■");
//				else
//				System.out.printf(" %2d ", bingo[i*5+k]);
//			}
//			System.out.println();
//		}
//
		
		
		// 과제 풀이
		 Scanner sc = new Scanner(System.in);
		 
		 int [] bingo = new int [25];
		 
		 for (int i = 0; i < bingo.length; i++) {
			 bingo[i] = (int)(Math.random()*50+ 1); // 입력될 랜덤값 변수 담기
			 for(int k = 0; k < i; k++) { // bingo에 숫자가 저장되어있는 곳까지
				 if(bingo[k] == bingo[k]) { // 배열값중 num와 같은 값이 있다면
					 i--; // i값은 계속 증가되기 때문에 중복값이 나오면 지나가게됨. 그래서 i값을 1개 줄여서 다음 식이 똑같은 인덱스에 머물도록 설정
					 break;
				 }
			 }
		 }
		
		 
			while (true) {
				
				// 5줄 5칸 출력
				for(int i = 0; i <= 4; i++) {//빙고판 출력
					for (int k = 0; k <= 4; k++) {
						if(bingo[i*5+k] == 0)
							System.out.printf(" %2s ", "■");
						else
						System.out.printf(" %2d ", bingo[i*5+k]);
					}
					System.out.println();
				}
			
				System.out.println("숫자입력 : ");
				int num = sc.nextInt();
			
				for (int i = 0; i < bingo.length; i++) {
					if (bingo[i] == num) {
						bingo[i] = 0;
					}
				}	
				
				
				  int 빙고=0, 가로=0, 세로=0, 대각선1=0, 대각선2=0;
				  
				  for(int i = 0; i<5; i++) {
					  for (int k = 0; k < 5; k++) {
						  if (bingo[i*5+k] == 0) 가로++;
						  if (bingo[k*5+i] == 0) 세로++;
					  }
					  if (bingo[i*6] == 0) 대각선1++;
					  if (bingo[i*4+4]==0) 대각선2++;

					  if(대각선2 == 5) 빙고++;
					  if(대각선1 == 5) 빙고 ++;
					  if(가로 == 5) 빙고++;
					  if(세로 == 5) 빙고++;
					  
					  가로=0;
					  세로=0;
					  
				  }
				  if(빙고 == 5) {
					  System.out.println("5줄 빙고");
					  break;
				  }

			}
			

		 
		

	}

}
