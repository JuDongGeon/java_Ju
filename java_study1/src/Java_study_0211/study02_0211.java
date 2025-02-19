package Java_study_0211;

import java.util.Arrays;
import java.util.Scanner;

public class study02_0211 {

	public static void main(String[] args) {
		// 배열 응용
		
		Scanner scan = new Scanner(System.in);
		
		int [] game = new int [25];
		
		// game 배열에 값 채우기
		for (int i = 0; i < game.length; i++) 
			game[i] = (int)(Math.random()*50+1);
		// System.out.println(Arrays.toString(game));
		
		while (true) {
		
			// 5줄 5칸 출력
			for(int i = 0; i <= 4; i++) {//빙고판 출력
				for (int k = 0; k <= 4; k++) {
					if(game[i*5+k] == 0)
						System.out.printf(" %2s ", "■");
					else
					System.out.printf(" %2d ", game[i*5+k]);
				}
				System.out.println();
			}
		
			System.out.println("숫자입력 : ");
			int num = scan.nextInt();
		
			for (int i = 0; i < game.length; i++) {
				if (game[i] == num) {
					game[i] = 0;
				}
			}
		}
	}

}
