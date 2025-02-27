package testMain_0226;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class sdfsdf {

	public static void main(String[] args) throws ParseException {
		// Date 타입 설명
		
		Date today = new Date();
		
		System.out.println(today);
		
		// 연도 출력
		System.out.println(today.getYear() + 1900);
		
		// 월 출력
		System.out.println(today.getMonth() + 1);
		
		// 일 출력
		System.out.println(today.getDate());
		
		// 요일 출력
		System.out.println(today.getDay());
		
		// 시분초 출력
		System.out.println(today.getHours()); // 시
		System.out.println(today.getMinutes()); // 분
		System.out.println(today.getSeconds()); // 초

		System.out.println(today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds()); // 시분초 이어서 출력
		
		// 날짜와 시간 포맷 지정하는 방법

		// 2025.2.27
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String myDate = sdf.format(today);
		System.out.println(myDate);
		
		// 몇시 몇분 몇초
		SimpleDateFormat time = new SimpleDateFormat("hh시 mm분 ss초");
		String myTime = time.format(today);
		System.out.println(myTime);
		
		
		// 날짜 차이 구하기
		// 2024.12.18 부터 오늘까지 몇일인지 구하기
		
		Date start = new SimpleDateFormat("yyyy.MM.dd").parse("2024.12.18");
		
		// 초단위 차이
		long difsec = (today.getTime() - start.getTime())/1000; //초단위로 만들기 위해 1000을 나눔
		System.out.println(difsec);
		
		// 분단위 차이
		long difmin = difsec/60;
		System.out.println(difmin);
		
		// 시단위 차이
		long difhour = difmin/60;
		System.out.println(difhour);
		
		// 일단위 차이
		long difDays = difhour/24;
		System.out.println(difDays);
		
		
		
		
		
	}

}
