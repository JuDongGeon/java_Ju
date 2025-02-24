                     package Java_study_0220;

public class JavaMethod {

	/* 매서드(함수)의 형태
 	1. 반환과 매개변수가 없는 형태
 	2. 반환은 없고 매개변수는 있는 형태
 	3. 반환은 있고 매개변수는 없는 형태
 	4. 반환과 매개변수 모두 있는 형태
	 */
		
	static void output() { // 반환과 매개변수가 없는 매서드(함수) 입력방법
		System.out.println("반환이 없는");
		System.out.println("매개변수도 없는 매서드");
	}	
		// 매서드 반환 값(출력값)이 없는 경우 void 타입으로 작성한다.
		
		// 위 매서드 정의
		// 반환과 매개변수가 없는 메서드 형태
		// 외부 데이터도 필요없고 출력하는 값도 없기 때문에 대부분 단순 출력용으로 사용하는 경우가 다수. ex) 메뉴
		// 또는 클래스 객체의 메서드인 경우에도 반환과 매개변수 없이 정의한다.
		
	
	static void sum(int num1, int num2) {// 두 정수의 합을 구하는 메서드 
		System.out.println("합 : " + (num1+num2));
	}
	
	static void sum(int num1, float num2) {
		System.out.println("합 : " + (num1+num2));
	}
		
		// 위 매서드 정의
		// 반환이 없고 매개변수가 있는 메서드 형태
		// 매서드의 내용을 실행하는데 필요한 데이터를 가지고 있지않다면 매서드 외부에서 데이터를 가져와야 함
	
	
	static int total() {
		int a =10, b=20, c=30;
		int tot = a+b+c;
		return tot;
	}
	
		// 위 매서드 정의
		// 반환이 있고  매개변수가 없는 메서드
		// 매개변수가 필요없기 때문에 자체적으로 필요한 데이터를 생성할 수 있거나
		// 클래스 객체가 가지고 있는 인스턴스 변수의 데이터를 가공(계산같은거)하여 외부를 내보내기 위한 목적
		// ex) int num = scan.nextInt();
	
	
	static String game(int val) { // 1-가위, 2-바위, 3-보
		if(val == 1)
			return "가위";
		if(val == 2)
			return "바위";
		if(val == 3)
			return "보";
		return "잘못입력했습니다";
	}
		// 반환, 매개변수가 있는 메서드 name.equals("박문수");
		// 반환인 있는 메서드에서 if문으로 return을 했다면 참인경우에만 동작할 수 있기 떄문에 별도의 return 이 필요
		// if () return 123; else return11233; => 이런 형태면 별도의 return 필요 x 
	
	
	static void compare (int num1, int num2) {
		if (num1 < num2)
			System.out.println("큰 값 : " + num2);
		if (num1 > num2)
			System.out.println("큰 값 : " + num1);
		if (num1 == num2)
			System.out.println("두 수가 같다.");
	}
	
	static int sum(int k, int e, int m) {
		int sum = k+e+m;
		return sum;
	}
	
	static void avg(int sum) {
		float avg = sum/3;
		System.out.println("평균 : " + avg);
	}
	
	
	public static void main(String[] args) {

		output(); // -> 이렇게 작성하면 output 매서드가 실행된다
		
		sum(20,30);
		sum(30,59);
		
		int a = 45, b =3256;
		sum (a,b);
		
		int num = total();
		System.out.println(num);
		
		compare(3,3);
		
		int kor = 88, eng = 91, mat  = 74;
		int total = sum(kor,eng,mat);
		System.out.println("총점 : " + total);
		avg(total);
		
	}

}
