package java_study_0210;

public class study03_0210 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		int [] sum = new int[3];
//		int [] a = new int [] {10,20,30};
//		int [] b = new int [] {1,5,9};
//		
//		// a배열과 b배열의 합을 sum에 저장
//		sum[0] = a [0] + b[0];
//		sum[1] = a [1] + b[1];
//		sum[2] = a [1] + b[1];
//		
//		for (int i=0; i<sum.length; i++) {
//			sum[i] = a[1] + b[i]; 
//		}
		
		// a 와 b 배열의 데이터를 total 배열에 저장하기
		// a 배열의 값 먼저 저장하고 이어서 b 배열의 값 저장한 뒤 total 배열 값 출력
		
		int [] total = new int[10];
		int [] a = new int [] {10, 20, 30, 40, 50};
		int [] b = new int [] {55, 44, 33, 22, 11};
		
//		for 문 2개 방식
		
//		for (int i = 0; i < a.length; i++) {
//			total[i] = a[i];
//		}
//		for (int i = 0; i < b.length; i++) {
//			total[i+5] = b[i];
//		}

//		for 문 1개방식
		for (int i = 0; i<a.length; i++) {
			total[i] = a[i];
			total[i+a.length] = b[i];
		}
		
		
		for (int i = 0; i < total.length; i++) {
			System.out.println(total[i]);
		}
		
		
		char [] name = new char [5];
		name[0] = 'j';
		name[1] = 'o';
		name[2] = 'h';
		name[3] = 'n';
		
		// name 이라는 배열에 인덱스는 'john'이라는 문자가 저장되고 마지막인덱스는 아직 없음
		// 문자열은 배열이지만 char 배열로는 온전한 문자열 입력이 어렵다.
		// 배열이기 때문에 인덱스를 통해 문자 하나씩 입력 저장 해야한다.
		// 그래서 자바에서는 문자열의 사용을 편하게 하기위해 String 이라는 클래스가 존재
		// String 클래스에는 내부적으로 char 배열이 생성 되도록 되어 있다.
		
		
		System.out.println(name);
		System.out.println("member".length());
		
		
		// String 은 기본 타입처럼 쓸 수 있으나 다른 기본타입과 달리 클래스 타입이다
		// 클래스 타임
		
		// String 사용방법 1
		String myName = "john";
		System.out.println(myName);
		myName = "설경구";
		System.out.println(myName);
		System.out.println(myName.charAt(2));
		
		// String 사용방법 2
		String youName = new String("박문수");
		System.out.println(youName);
		
		
		
	}

}
