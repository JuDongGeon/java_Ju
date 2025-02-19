package java_study_0217;

public class study_0217 {

	public static void main(String[] args) {
		// 클래스 설명

		// 데이터 저장 - 변수
		
		// 이름, 나이, 직업, 몸무게, 시력, 생년월일
		// 100명의 데이터를 저장하기 위해서는 서로 다른 종류의 데이터이기에 100의 크기인 1차열 배열을 6개 만들어야 한다
		// String[] names = new String[100];
		
		
		
//			struct member { // 구조체 - member라는 이름의 타입 => 자바에서는 구현안됨
//				String name;
//				int age;
//				
//			}
//			Member info; // member 타입의 변수 info
//			info.name = "김유신";
//			info.age = 24;
//			
//			member[] men = new member[100] // 구조체를 이용한 배열 만들기

// 기본데이터 타입으로 선언한 변수는 데이터 저장이 직접 가능 => ex) int num = 10;
// 참조변수에는 메모리주소 저장한다.
// 그래서 자바에서는 new 연산자를 통해서 공간을 할당받아 해당 공간에 주소를 저장한다.
		Member member = new Member();
		member.name = "김유신";
		member.age = 30;
		System.out.println(member.name);
		
		Member my  = new Member(); // 인스턴스 생성(객체생성)
		my.name = "박문수";
		my.age =25;
		
		// 동물종류, 동물이름, 나이
		// 동물종류에는 개, 고양이, 닭, 토끼 등등
		// 동물이름은 볼트, 렉스, 웅이, 꼬끼오, 총총이 등등
		// 나이는 하고 싶은 나이
		// 동물 한마리에 대해서 데이터 입력하고 출력
		
		Animal leo = new Animal();
		leo.type = "강아지";
		leo.name = "레오";
		leo.age = 2;
		
		System.out.println("동물이름" + leo.name);
		
	}

}

// 클래스 - 사용자 정의 데이터 타입으로 구조체와 비슷한 느낌
// 사용방법 : class 클래스 이름 { } => 해당 구조로 작성
// 클래스 이름은 첫글자를 대문자로 작성
// 클래스 용도 - 데이터 저장, 기능 구현

/* 프로그래밍 명명 규칙(name rule)
  	1. 카멜 표기법 
  	 - 첫문자를 제외하고 단어의 첫 글자를 대문자로 표현 => ex) myVisitorCount
  	 - 함수, 인스턴스, 객체, 변수에 사용됨
  	2. 스네이크 표기법
  	 - 모든 단어 사이에 _를 붙여서 이름 짓기 => ex) my_visitor_count
  	 - 데이터베이스의 테이블명, 컬럼명에 사용됨
  	3. 파스칼 표기법
  	 - 카멜 표기법과 유사하지만 첫문자부터 대문자로 표기 => ex) MyVisitorCount
  	 - 객체지향 언어(자바같은 거)의 클래스나 constructor 명에 사용됨
  	4. 케밥 표기법
  	 - 스네이크 표기법 같이 단어와 단어 사이에 - 룰 븉혀서 사용 => ex) my-visitor-count
  	 - css 의 class 명, web url 에 사용됨  	  
 */



class Member { // 클래스 정의 - 클래스안의 내용으로 데이터 저장될 수 있게 정의만 한것
	String name; //이름 저장
	int age; // 나이 저장 
	float eyes; // 시력 저장
}

class Animal { // 동물 정보 저장 클래스
	String type; // 동물 종류
	String name; // 동물 이름
	int age; // 동물 나이
}

