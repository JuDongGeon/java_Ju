package java_study_0214;

import java.util.Arrays;

public class study_0214 {

	public static void main(String[] args) {
		// 문자열

		//String str = "member"; //String str = new String ('member');
		//System.out.println(str.charAt(0));
		
		String srt = new String ("member");
		char[]c = new char[] {'a'};
		System.out.println(srt);
		System.out.println(c);
		
		String []names = new String [5];
		names[0] = new String ("박문수");
		names[1] = "김정호";
		names[2] = "서경림";
		names[3] = "김명준";
		names[4] = "이정훈";
		System.out.println(Arrays.toString(names));
		
	
		
		
				
		// 참조변수 : 특정 공간의 메모리주소만 정장할 수 있는 변수
		 /* 참조변수 종류
		  * 1. 배열의 주소를 갖는 참조변수 => 참조변수이름[인덱스] 방식으로 사용
		  * 2. 객체의 주소를 갖는 참조변수 => 참조변수이름.xxxxx 방식으로 사용
		  */
		
		
		
		
	}

}
