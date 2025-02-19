package Java_study_0207;

import java.util.Scanner;

public class java_hw_0207 {

	public static void main(String[] args) {
//	  	오늘의 과제 - 숫자 야구
//	  	 1~9 중의 임의의 숫자 3개를 뽑아낸다. (중복없이)
//	  	 3개의 숫자를 맞추기 해야한다.
//	  	 예) 임의의 숫자 - 7 1 8
//	  	 입력 : 1 2 3
//	  	 결과 : 0스트라이크 1볼 2아웃
//	  	 입력 : 4 7 9
//	  	 결과 : 0스트라이크 1볼 2아웃
//	  	 입력 : 4 1 8
//	  	 결과 : 2스트라이크 0볼 1아웃
		
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, n3;
		
		do {
			n1 = (int)(Math.random()*9+1);
			n2 = (int)(Math.random()*9+1);
			n3 = (int)(Math.random()*9+1);	
		} while (!(n1 != n2 && n1 != n3 && n2 != n3));
		// 3개의 숫자가 중복없이 1~9까 중의 하나를 가짐	
		
		
		while (true) { // 숫자 맞출때까지 계속 입력해야 하니까 무한루프
		 System.out.print("숫자 세개 : ");
		 int u1 = scan.nextInt();
		 int u2 = scan.nextInt();
		 int u3 = scan.nextInt();
		 
		 int str = 0, ball = 0; // 스트라이크, 볼표현 아웃은 계산으로 
		 
		 // 스트라이크의 경우
		 if (n1 == u1) str++;
		 if (n2 == u2) str++;
		 if (n3 == u3) str++;
		 
		 //볼의 경우
		 if (n1 == u2 || n1 == u3) ball++;
		 if (n2 == u1 || n2 == u3) ball++;
		 if (n3 == u1 || n3 == u2) ball++;
		 
		 System.out.printf("%d스트라이크 %d볼 %d아웃 \n", str, ball, 3 - str - ball);
		 if(str == 3) break; // 3개 숫자를 맞췄다면 끝
		}
		
		
		

	}

}
