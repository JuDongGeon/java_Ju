package java_study_0211;

import java.util.Arrays;
import java.util.Scanner;

public class java_hw_0211 {

	public static void main(String[] args) {
		// 250211 과제
		
		/*5줄 빙고판 만들기
		 * 중복으로 숫자가 들어가지 않는 5*5 빙고판 만들기
		 * 5줄 빙고가 되었을때 게임이 끝나도록 빙고판 만들기
		 * 기본틀은 study02_0211 클래스 파일 팜고
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int [] bingo = new int [25]; // 빙고 배열
		int num = (int)(Math.random()*50+1);
		
		for(int i = 0; i <= 4; i++) {//빙고판 출력
			for (int k = 0; k <= 4; k++) {
				if(bingo[i*5+k] == 0)
					System.out.printf(" %2s ", "■");
				else
				System.out.printf(" %2d ", bingo[i*5+k]);
			}
			System.out.println();
		}


	}

}
