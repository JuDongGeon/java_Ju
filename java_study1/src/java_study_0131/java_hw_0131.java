package java_study_0131;

import java.util.Scanner;

public class java_hw_0131 {

	public static void main(String[] args) {
				// 과제
				// 주차장 기본요금 1000원에 기본 시간 30분
				// 10분당 추가요금은 100원
				// 2시간 이상 주차시 기본요금 1700원
				// 4시간 이상 주차시 기본요금 2500원
				// 8시간 이상은 시간 상관없이 10000원
				// 주차시간을 몇시간 몇분을 입력해서 주차요금을 출력

		Scanner time = new Scanner(System.in);

		int pHour = 0; //주차 시간
		int	pMinute = 0; // 주차 분
		System.out.print("시간을 입력하세요 : ");
		pHour = time.nextInt();
		System.out.print("분을 입력하세요 : ");
		pMinute = time.nextInt();
		
		System.out.println("주차시간 : " +pHour + "시간" + pMinute +"분");
		
		int defaultCost = 1000; //기본 주차 요금
		int defaultTime = 30; //기본 주차시간
		int plusCost = 100; //추가요금
		int twoHourCost = 1700; //2시간 기본 요금
		int fourHourCost = 2500; //4시간 기본요금
		int eightHourCost = 10000; // 8시간 이상 기본요금
		int parkingCost = 0; // 주차요금	
		
		if (pHour == 0 && pMinute == 0) {
			parkingCost = 0;
		} // 주차시간이 0시간 0분일 때
		else if (pHour == 0 && pMinute <=39) {
			parkingCost = defaultCost;
		} //주차시간이 40분 미만 일떄
		else if (pHour < 2 && pMinute <= 59) {
			parkingCost = defaultCost + ((((pHour * 60) + (pMinute - defaultTime))/10)*plusCost);
		} // 주차시간이 40분 이상 2시간 미만일때
		else if (pHour < 4 && pMinute <= 59) {
			parkingCost = twoHourCost + (((((pHour-2) * 60) + pMinute)/10)*plusCost);
		} // 주차시간이 2시간 이상 4시간 미만일때
		else if (pHour < 8 && pMinute <= 59) {
			parkingCost = fourHourCost + (((((pHour-4) * 60) + pMinute)/10)*plusCost);
		} // 주차시간이 4시간 이상 8시간 미만일때
		else if (pHour >= 8 && pMinute <= 59) {
			parkingCost = eightHourCost;
		} // 주차시간이 8시간 이상일때
		System.out.println("주차요금 : " + parkingCost +"원");
	}
		
		

}
