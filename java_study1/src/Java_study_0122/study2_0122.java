package Java_study_0122;

public class study2_0122 {

	public static void main(String[] args) {
		// 연산자 활용 2(증감)
		
		// 증감 연산자 ++, --
		int a = 10, b = 10, result = 0;
		
		System.out.println("++ 전 : "+ a);
		
		// ++
		a++; // 1중가됨 
		System.out.println("++ 후 : "+ a);
		
		++a; //
		System.out.println("++a : " + a);

		// 증감 연산자의 위치에 따른 차이
		a = 10;
		result = a++;
		System.out.println("result = a++ :" + result); // => result = a++; => result = a; 작업후 a=a+1; 을 뜻함
		result = ++b;
		System.out.println("result = ++b :" + result); // => result = ++b; => b=b+1; 작업후 result = b; 을 뜻함
		// 증감연산자를 변수 앞에 붙이면 우선순위가 상위권
		// 증감연산자를 변수 뒤에 붙이면 우선순위가 하위권
		
		
		
		

	}

}
