package java_study_0211;

import java.util.Arrays;
import java.util.Collections;

public class study_0211 {

	public static void main(String[] args) {
		// 배열비교 매서드
		
		int [] number = new int [] {10, 20, 30, 44, 55, 66, 100, 2323};

		for (int num : number) {
			System.out.println(num);
		}
		// 배열에 저장된 순서대로 전부 불러옴
		// 배열의 인덱스 사용 불가 -> 각각을 찾아오지 못한다는뜻
		// 배열의 데이터 변경하거 삭제 불가
		// 단순 출력이나 배열의 특정위치값 조회에 쓰임
		// 키보드를 통한 입력 불가
		
		/* 문제
		 * tall 배열은 A반 학생들의 키를 저장한 것이다.
		 * A반의 평군키 보다 큰 키를 찾아서 출력하세요.
		 */
		float[] tall = new float [] {167.2f, 163.4f, 175.7f, 173.8f, 158.3f};
		float avg = 0, sum = 0;
		for (float t : tall ) {
			sum = sum + t; // 총합구하기
		}
		avg = sum/tall.length; //평균구하기
		for(float t : tall) {
			if (avg <= t) 
				System.out.println(t);
		}
		
		int [] num = new int [] {10, 20, 30, 40, 50, 60, 70,};
		
		System.out.println(Arrays.toString(num)); // 자바에서 데이터 출력 메서드 이름은 toString
		
		int [] a = new int[7];
		System.out.println(Arrays.toString(a));
		
		// 배열복사( System.arraycopy )
		// 사용 방법 : array( 복사배열이름, 복사배열시작인덱스, 저장할 배열이름, 저장배열시작인덱스, 저장할 갯수);
		System.arraycopy(num, 0, a, 0, num.length);
		System.out.println(Arrays.toString(a));
		
		boolean isSame = Arrays.equals(num, a);
		System.out.println(isSame);
		
		// 배열정렬 (
		int [] arr = new int [] {12,145,1345,356,234,523,345,123,456};
		System.out.println("==== 정렬 전 ====");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("==== 정렬 후 ====");
		System.out.println(Arrays.toString(arr)); // 기본적으로 오름차순으로 정렬됨
		
		Integer [] arr2 = {3,4,2,3,1}; // => integer 는 정수 클래스 타입
		
		Arrays.sort(arr2, Collections.reverseOrder()); //=> 내림차순 정렬. comparator 구현 필요
		System.out.println(Arrays.toString(arr2));
		
		
		String [] names = {"이순신", "이성계", "정약용", "김춘추", "문익점"};
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println(Arrays.toString(names));
		
				
		
		
	}

}
