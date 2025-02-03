package java_study_0203;

public class study02_0203 {

	public static void main(String[] args) {
		// switch 문
		// if 문과 switch 문 차이는 if 는 범위가 정해졌을때 사용하지만, switch 특정 값을 선택하는 개념
		// if 문 단독으로는 break 는 사용 불가, 다른 거와 혼합되면 사용 가능
		
		
		
		
		switch(3)  { // 선택할 케이스에 데이터를 switch() 괄호안에 넣어주면 해당 case 기준으로 실행됨. 
					 // 데이터 종류가 맞아야함(정수면 case 도 정수. 문자열이면 case 도 문자열 단, 정수에 case를 문자로 입력해도 문자표가 되기 때문에 가능하다.)
			case 1 : //case 뒤에 데이터를 입력. 정수,문자(''가 필요) 다됨. 실수는 안됨,
				System.out.println("1을 선택");
				break; // break 를 통해 강제종료 시킴. break 가 없으면 선택된 케이스 밑에 모든 값이 실행됨 => 중괄호가 닫히기 전까지만 실행됨
			case 3 :
				System.out.println("3을 선택");
				break;
			case 10 :
				System.out.println("10을 선택");
				break;
		}
		
		
		int num = 5;
		switch(num) {
			case 10 : 
				System.out.println("10을 선택");
				break;
			case 30 :
				System.out.println("30 할거여?");
				break;
			case 20 :
				System.out.println("case에 표현되는 데이터는 정수,문자,문자열");
				break;
			case 50 :
				System.out.println("입력된 값에 맞는 case 실행은 " + "break 또는 } 까지 실행");
				break;
			default :
				System.out.println("case 없는 값은 다 default 값으로 출력됨");
		}
		
		
			/*
			if (점수 <= 100 && 점수 >= 90){
				"A학점"
				}else if (점수 <= 89 && 점수 >= 80){
				"B학점"
				~~~~ 이런 if 문을 switch 문으로 만들기
			*/
		
			int 점수 = 79;
			switch (점수/10) {
				case 10 :
				case 9 :
					System.out.println("A학점");
					break;
				case 8 :
					System.out.println("B학점");
					break;
				case 7 :
					System.out.println("C학점");
					break;
				case 6 :
					System.out.println("D학점");
					break;	
				default : 
					System.out.println("F학점");
			}
		
		
		
		

	}

}
