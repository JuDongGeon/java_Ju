package java_study_0210;

public class java_hw_0210 {

	public static void main(String[] args) {
		// 250210 과제 

		/* 랜덤 범위 1 ~ 50 중 짝수 15개를 배열에 저장
		 * 15개 전부 저장 되면 배열 출력 하시오
		 * 중복 상관없음
		 */
		
		int [] number = new int [15];
		int count = 0;

		while (count < 15){
			int a = (int)(Math.random()*50+1);
			
			if (a%2 == 0) {
				number[count] = a;
				count++ ;
			}
			
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}

		
	}
}
