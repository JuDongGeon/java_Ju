package java_study_0213;

import java.util.Scanner;

public class study_0213 {

	public static void main(String[] args) {
		String title = "자바는 즐거워";
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("제목입력 : ");
//		title = scan.next();
		// nextLine();을 하거나 next();를 해도됨
		
		System.out.println(title);
		
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		// next 와 nextLine 의 차이점
		// 키보드로 입력시 버퍼가 쌓인다. => 엔터를 입력하면 현재까지 쌓인값이 저장되고 해당 버퍼자리에는 엔터가 입력된다.
		// next()는 엔터 이전의 버터에 쌓여있는 값을 가져온다.
		// nextLine()은 버퍼에 엔터가 있어야 버퍼의 값을 가져온다. 그렇기때문에 스캐너명.nextLine 값을 한번더 위쪽에 써줘야한다.
		
		// 파일 불러오기(읽기)를 하면 버퍼의 영향을 받을수도 있다.
		// next()를 이용해서 문자열을 입력 받는 것이 무조건 답을 아니다.
		// 필요에 의해서는 nextLine을 통해 문자열을 입력받아야 할 때도 있다.

		
		System.out.println(name + " " + age );
	
	}

}
