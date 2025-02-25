package Java_study_0225;

public class JavaControll {

	final void sum(int a, int b) {
		System.out.println("i'm sum");
	} 
	
	final void sum(int a) {
		int tot = a+20;
		System.out.println("No, it's me");
	}
	
	public static void main(String[] args) {

		
		final int year = 2025; // year 라는 변수 값을 변경불가로 만듬 
		
		
		System.out.println(year);
		
		Movie m = new Movie();
		// private 제어자가 붙은 변수에 데이터 저장은 생상자 메서드를 사용해서 변수 초기화
		
		System.out.println(m.getTitle());

	}

}

/*
 	변수 생성 시기
 	
	 1. 인스턴스 변수 - 객채 생성시 생성 되는 변수 또는 메서드
 		생성 모습 => new 클래스명()	;
 		
 	 2. 클래스 변수 - static 제어자가 붙는 변수 또는 메서드로 프로그램 실행시 생성
 	 
 	 3. 지역 변수 - 메서드 내부, 제어문 내부 등 {}블럭 안에 선언하는 변수로 메서드나 제어문 호출시 할당되는 변수 
 	
 	
 	 자바 클래스 제어자
 	 
 	 1. final - 변하지 않는, 변경되지 않는
 	 	사용 : 변수, 메서드 클래스 사용가능
 		* 메서드에 final 을 할 경우 오버라이딩은 변경불가가 적용되지만 오버로딩에는 적용되지않는다
 		  -> 이유 : 오버라이딩은 기존메서드의 내용을 재정의하는것이고 오버로딩은 새로운 메서드를 정의하는 것이기 때문에
 		   		   기존 내용을 변경못하게 하는 오버라이딩에는 적용되지만 새로운 메서드를 만들어 내는 오버로딩에는 적용되지 랂는다.
 	 
 	 2. static - 클래스의, 공통적인 이라는 의미로 모든 객체(인스턴스)들이 공통으로 사용할 수 있는 변수 또는 메서드
 	 
 	 3. abstract - 추상적인 의미로 클래스나 메서드에 사용됨.
 	 			 - 추상메서드를 가진다면 클래스 또한 추상클래스가 되어야 한다
 	 			 - 추상 클래스는 객체 생성이 불가능
 	 
 	 접근 제어자
 	 
 	 1. public - 자바 프로그램 어디서든 누구든지 사용 가능(패키지가 다른경우 import 가 필요)
 	 		
 	 2. default - 같은 패키지에서만 사용가능. 기본적으로 다 붙어 있음
 	 
 	 3. protected - 같은 패키지에서 사용가능. 상속된 경우에는 패키지가 달라도 사용가능
 	 
 	 4. private - 클래스 내부에서만 사용가능(같은 패키지여도 사용불가)
 	 
 	 
 	 
 */