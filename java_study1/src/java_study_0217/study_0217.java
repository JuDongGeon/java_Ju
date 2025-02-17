package java_study_0217;

import java.util.Arrays;
import java.util.Scanner;

public class study_0217 {

	public static void main(String[] args) {
		// 문제풀기
		
		/*
		 문제 4. 
		 각 사람이 대출한 책의 제목을 배열로 저장하고 그사람의 대출 내역을 출력하는 프로그램을 작성
		 조건.
		  - 도서관에는 3명의 이용자가 있고, 최대 5권까지 대출가능
		  - 각 이용자의 이름과 대출한 책 제목 출력
		  # 이용자의 이름과 책 제목은 키보드를 통해 입력해도 되고, 배열 선언시 초기값 지정해도 되고
		 */

		Scanner sel = new Scanner(System.in);
		
		String [][] book = new String [][] {
			{"김철수","신과함께", "마음의소리","화산귀환","전독시","나노마신"},
			{"이맹구", "노인과 바다", "총균쇠","나의라임오렌지나무","프로메터우스","헴릿"},
			{"차유리","이순신", "세종대왕","장보고","주몽","광개토대왕"}
		};
		
		for (String[] info : book) {
			for (String tmp : info) {
				System.out.println(tmp);
			}
			System.out.println();
		}
		
		
		/*
		 문제 5.
		 농장 수확량 계산
		 농장의 일일 수확량을 배열에 저장
		 전체 수확량을 구하고, 평균 수확량을 구하기
		 가장 많은 수확량 출력
		 */
		
		int [] harvest = {9,10, 11, 8,7, 5};
		int total=0, avg=0, big=0;
		
		for(int i = 0; i < harvest.length; i++) {
			total = total + harvest[i];
		}
		avg = total/harvest.length;

		for(int i = 0; i < harvest.length; i++) {
			if(big < harvest[i] ) {
				big = harvest[i];
			} 
		}
		
		Arrays.sort(harvest); // 정렬 오름차순
		
		
		System.out.println("총 수확량 : " + total);
		System.out.println("평균 수확량 : " + avg);
		System.out.println("가장 많은 수확량 : " + big);
		System.out.println("가장 많은 수확량 : " + harvest[harvest.length - 1]);
	}

}
