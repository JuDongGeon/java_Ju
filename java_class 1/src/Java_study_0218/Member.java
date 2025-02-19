package Java_study_0218;

public class Member {
	String name; //이름
	int age; // 나이
	String job; //직업
	
	
	// 생성자 메서드
	// 생성자 매서드는 자바에서 클래스를 정의할 때 기본 생성자 매서드도 같이 만들어진다.
	// 없어진게 아닌 눈에 보이지 않게 생략처리 된것
	// 생성자매서드는 클래스 객체 공간 생성시 인스턴스들의 초기화를 담당하는 매서드이다.
	
	
	Member (){// 기본 생성자 매서드
		this.name = "박문수";
		System.out.println(this);
	}
	
	Member (int age, String job){
		this.age = age;
		this.job = job;		
	}
	
	Member (int age, String job, String name){
		this.age = age;
		this.job = job;
		this.name = name;
	}
	
	// 오버로딩 : 하나의 매서드 이릅으로 여러 기능을 구현하는 것 ex)System.out.print 같은것
	/* 오버로딩 조건
	 1. 매서드 이름이 같아야 한다.
	 2. 매개변수타입이 같으면 안됨
	 3. 매개변수 갯수는 달라도 됨
	 4. 하나의 클래서 내부에서만 가능하다
	 */
	
	/* 자바 변수 종류
	 1. 인스턴스 변수
	 2. 지역변수
	 3. 클래스 변수 
	 */
	
	// 변수 우선 순위(이름이 같은 경우)
	//  
	
}
