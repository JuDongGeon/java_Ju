package Java_study_0121;

public class study3_0121 {

	public static void main(String[] args) {
		// 출력방법 설명 및 형식 지정자
		
		// System.out.println();-> 한줄에 하나씩 출력
		// System.out.print(); -> 한줄에 이어서 출력 한개가 더 있으면 그다음에 이어서 출력
		// System.out.printf(); //print뒤에 f는 format을 뜻함 이 방법은 println과 print 양쪽 방식 모두 사용 가능 내가 선택해서 가능
		// \n 은 엔터라는 뜻에 특수문자 
		// \t 는 tab이라는 뜻에 특수문자
		// " %d ", 콤마 뒤에 있는 정수데이터에게 엔터로 적용되는 형식 지정자(서식문자)
		/* 
		 * 형식 지정자(서식 문자)==>책 50페이지에 나옴
		 * %d, %i - 10진수 정수
		 * %f - 10진수 실수
		 * %c - 문자
		 * %s - 문자열
		 * %b - boolean 타입
		 */
		
		//예시
		System.out.printf("평소에는 그냥 print 처럼 사용가능");
		System.out.printf("println 처럼 사용은 \n");
		System.out.printf("봐봐 이거처럼\n은 아무대나 \\n넣어도됨\n");
		System.out.printf(" %d ", 100);
		System.out.printf(" %% ");
		/*
		 * 형식 지정자 사용시 주의사항
		 * 1. 형식지정자와 데이터 위치를 맞춰야한다
		 * ex) System.out.printf(" %d %f", 100, 3.14); -> 정수가 먼저니 데이터를 정수부터 쓰고 그다음에 실수 쓴거
		 * 2. 형식 지정자와 데이터 갯수 맞추기
		 * ex)System.out.printf(" %d %d %d ", 10, 20, 30);
		 * -> 형식지정자가 적은 경우 형식지정자 수만큼 데이터가 출력
		 * -> 형식지정자보다 데이터가 적은 경우 오류
		 */
		
		// 같은 출력을 위한 println 과 printf 차이
		System.out.println(2025+ "년 " + 1 + "월 "+ 21 + "일");
		System.out.printf("%d년 %d월 %d일 \n", 2025, 1, 21);
		
		float fnum = 5.12345f;
		System.out.println("println 출력 : " + fnum); // 원하는 소수점까지만 표현하려면 수학 매서드 필요
		System.out.printf("printf 출력 : %.1f \n", fnum); // float 이기 때문에 소수점 6번째까지 표현되지만 별다른 수학매서드 없이 원하는 자리까지만 표시가능
		
		int num = 15;
		System.out.println(num); // 가지고 있는 데이터만 출력됨
		System.out.printf("%4d\n", num); // %4d 같은 경우 출력을 4자리로 표현하고 오른쪽 정렬하여 출력 만약 %-4d의 경우는 4자리 표현 후 왼쪽정렬로 출력
	}

}
