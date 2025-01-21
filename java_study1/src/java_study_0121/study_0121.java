package java_study_0121;

import java.util.Scanner;

public class study_0121 {

	public static void main(String[] args) {
		
		
		
		/* 250120 과제 해설
		 * int apple = 20;
		 * int orange = 15;
		 * int appleBox = 11;
		 * int orangeBox = 12;
		 * 
		 * int totalApple = apple * appleBox;
		 * int totalOrange = orange * orangeBox;
		 * int totalFruit = totalApple + totalOrange;
		 * 
		 * System.out.println("총 사과 개수 : "+ totalApple);
		 * System.out.println("총 오렌지 개수 : "+ totalOrange);
		 * System.out.println("총 과일 개수 : "+ totalFruit);
		 */
		
		
		// 사각형의 너비와 높이를 키보드를 통해 입력받고
		// 넓이를 계산하여 출력하세요
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("가로 입력 :");
		int width = input.nextInt();
		System.out.print("세로 입력 :");
		int length = input.nextInt();
		
		System.out.println("가로값 :" + width);
		System.out.println("세로값 :" + length);
		System.out.println("넚이 :" + width*length);
		
		//해답
		Scanner sc = new Scanner(System.in);
		int 가로=0, 세로=0;
		//오류가 최소화 하기위해 0값이라도 넣어주는게 좋음
		System.out.print("너비 입력 :");
		가로 = sc.nextInt();
		System.out.print("높이 입력 :");
		세로 = sc.nextInt();		
		// 넓이
		int area = 가로 * 세로;
		System.out.println("넚이 :" +area);
		
		
		
		
		
		

	}

}
