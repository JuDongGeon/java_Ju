package Java_study_0219;

public class ClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Food f1 = new Food(); // 기본생성자 메서들가 존재하기에 Food()가 실행됨
		
		
		
		/*
		 상품
		 상품명, 브랜드, 수량
		 상품을 등록하고자 하는데 필요한 클래스 정의
		 상품 정보를 저장하기 위한 생성자 매서드를 아래와 같이 구현
		  - 기본 생성자 매서드
		  - 상품명과 수량 초기화 가능한 생성자 메서드
		  - 상품명, 브랜드, 수량 초기화 가능한 생성자 메서드
		 */
		
		Product p1 = new Product();
		Product p2 = new Product("갤럭시북5",100);
		Product p3 = new Product("그램","LG전자",123);
		
		System.out.println(p3.brand);
				
		
		/* 매서드

		 	- 사용방법
			출력타입(반환타입) 메서드이름(매개변수{
				매서드 내용
			}
			
			- ex)
			int sum (int a, int b) {
				int num1 = a;
				int num2 = b;
				System.out.println(num1+num2);
			}
			
			int x=23, y=2435;
			sum(x,y);
			
		 */
		
		
		
	}

}
