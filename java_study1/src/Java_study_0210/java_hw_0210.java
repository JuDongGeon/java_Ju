package Java_study_0210;

public class java_hw_0210 {

	public static void main(String[] args) {
		// 250210 과제 

		/* 랜덤 범위 1 ~ 50 중 짝수 15개를 배열에 저장
		 * 15개 전부 저장 되면 배열 출력 하시오
		 * 중복 상관없음
		 */
		
//		int [] number = new int [15];
//		int count = 0;
//
//		while (count < 15){
//			int a = (int)(Math.random()*50+1);
//			
//			if (a%2 == 0) {
//				number[count] = a;
//				count++ ;
//			}
//			
//		}
//		
//		for (int i = 0; i < number.length; i++) {
//			System.out.println(number[i]);
//		}

		// 2502110 과제 해설(중복없음 버전)
		
		int [] aNumber = new int [15];
		int index = 0;
		
		while(true) {
			int aTemp = (int)(Math.random()*50+1);
			if (aTemp%2 == 0) {// 나누기 2를 했을때 나머지 값이 0이면 짝수
				// aNumber [index] = aTemp; => 중복상관없을때는 바로 아래 for 문부터 index++ 전까지 내용 없이 해당 주석을 이용하여 처리
				boolean isSame = false; // 같으면 true, 다르면 false
				for (int i = 0; i < index; i++) {
					if (aNumber[i] == aTemp) 
						isSame = true;
				}if(!isSame) 
					aNumber[index++] = aTemp;
			}
			if(index == aNumber.length) break; // index 값이 배열 크기와 같으면 배열의 마지막 공간까지 데이터 저장완료 
		}
		
		for (int i = 0; i < aNumber.length; i++) {
			System.out.printf(aNumber[i] + " ");
		}

		
	}
}
