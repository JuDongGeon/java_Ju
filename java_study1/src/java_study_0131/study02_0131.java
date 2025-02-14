package java_study_0131;

import java.util.Scanner;

public class study02_0131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner min = new Scanner(System.in);
		// if 문제 풀이
		
		
		// 문제 1.
		// 주차장 기본요금이 1000원이고 기본 시간은 30분이다.
		// 10분당 초과당 100원 추가요금을 붙는다
		// 주차를 몇분했는지 입력하여 주차요금을 계산해라
		
		int P = 0; //주차시간
		int Bcost = 1000; //기본 요금
		int Pcost = 100; // 10분당 요금
		int defaultTime = 30;
		System.out.print("주차 시간 입력 :");
		P = min.nextInt();
		if (P < 40 && P > 0) {
			System.out.println("주차요금 : " + Bcost + "원");
		} else {
			System.out.println("주차요금 : " + (Bcost + (((P-defaultTime)/10)*Pcost)) + "원");
		}
		
		
		// 과제
		// 주차장 기본요금 1000원에 기본 시간 30분
		// 10분당 추가요금은 100원
		// 2시간 이상 주차시 기본요금 1700원
		// 4시간 이상 주차시 기본요금 2500원
		// 8시간 이상은 시간 상관없이 10000원
		// 주차시간을 몇시간 몇분을 입력해서 주차요금을 출력
		
		
		
		
	}

}
