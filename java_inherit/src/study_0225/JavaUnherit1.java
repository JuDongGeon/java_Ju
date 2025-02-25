package study_0225;

public class JavaUnherit1 {

	public static void main(String[] args) {
		// 상속
		
		Tv tv = new Tv();
		
//		tv.onOff = true; // 전원 on
		tv.power(); // 전원 on true
		tv.power(); // 전원 off false
		tv.brand = "삼성";
		tv.price = 12000000;
		tv.name = "QLED 70인치 삼성 TV";
		
		

	}

}


/* 과제
 * 자바 클래스 상속관계를 표현할 수 있는 예시 2개이상 작성
 * 부모클래스 : XXX
 * 변수 : xoxoxo, xoxoxox
 * 메서드 : ____,_____,_____
 * 자식클래스 : ooo, ooo, ooo
*/




/* 
 	상속 - 클래스들 간의 관계를 부보-자식 관계라고 정의한다
		- 부모클래스의 변수 또는 메서드를 자식 클래스에서 사용가능하다
		- 여러 클래스들의 공통요소를 부모클래스로 구성한다.
		예) TV, 컴퓨터, 냉장고, 에어컨 => 공통적인 값 : 전기(파워), 플러그, 가격, 브랜드 etc
		 => 가전제품이라는 부모클래스에 전기, 가격, 브랜드 등을 정의하면 하위 TV, 컴퓨터 등 자식 클래스는 공통적으로 사용가능
	
	상속 이유
	1. 다형성 - 하나의 타입으로 여러가지 객체를 가져와 다양한 형태를 표현하기 위해
	
	
*/ 	