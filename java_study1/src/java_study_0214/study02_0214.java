package java_study_0214;

import java.util.Scanner;

public class study02_0214 {

	public static void main(String[] args) {
		// 배열 문제풀기

		// 문제1.
		// 학생 5명의 시험 성적을 키보드를 통해 입력받고 평균 점수를 구하여 출력하세요.
		
		Scanner Enter = new Scanner(System.in);
		
		int []test = new int [5];
		int std = 0;
		int sum = 0;
		int testAvg = 0;
		
		for (int i = 0; i < test.length; i++) {
			System.out.println(i+1 + "번 학생의 점수 : ");
			std = Enter.nextInt();
			test[i] = std;
		}
		for (int i = 0; i < test.length; i++) {
			sum += test[i];
			testAvg = sum/(i+1);
			
		}
		System.out.println(testAvg);
	
		
		// 문제 1 해설
		int[]score = new int [5];
		Scanner sc = new Scanner(System.in);
		
		int total = 0, avg; // 총합, 평균 변수
		
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"번쨰 학생 성적 입력 : ");
			score[i] = sc.nextInt();
			total = total + score[i];
		}
		
		avg = total/score.length;
		System.out.println(avg);
		
		
		
		
	}

}
