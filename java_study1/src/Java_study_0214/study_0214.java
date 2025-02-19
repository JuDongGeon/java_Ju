package Java_study_0214;

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
		

		// 참조변수 : 특정 공간의 메모리주소만 정장할 수 있는 변수
		 /* 참조변수 종류
		  * 1. 배열의 주소를 갖는 참조변수 => 참조변수이름[인덱스] 방식으로 사용
		  * 2. 객체의 주소를 갖는 참조변수 => 참조변수이름.xxxxx 방식으로 사용
		  */
		
		String []names = new String [5];
		names[0] = new String ("박문수");
		names[1] = "김정호";
		names[2] = "서경림";
		names[3] = "김명준";
		names[4] = "이정훈";
		System.out.println(Arrays.toString(names));	

		// 이름이 있는지 조회
//		boolean hasName = false;
//		
//		for(String name : names) {
//			if (name.equals("주동건")) {
//				hasName = true;
//				}
//		}
//		if (hasName)
//			System.out.println("이름이 등록되어 있습니다.");
//		else 
//			System.out.println("이름이 존재하지 않습니다.");

		//배열 -> 문자열
		String temp = String.join("-", names);
		System.out.println(temp);
		boolean hasName = temp.contains("서경림");
		if (hasName)
			System.out.println("이름이 등록되어 있습니다.");
		else 
			System.out.println("이름이 존재하지 않습니다.");
		
		// 학과명, 조교, 전화, 위치
		String [][]dept = new String [4][];
		dept[0] = new String[]{"컴퓨터공학과", "정보과학과", "정보통신공학과",	"정보산업공학과","전자공학과","문헌정보학과","전기공학과"	};
		dept[1] = new String[]{"이지은", "김영미", "박순애", "이춘애","이미선","김기범","박준용"};
		dept[2] = new String[]{"3333", "3334", "3335", "3336","3337","3338","3339"};
		dept[3] = new String[]{"T101", "T201","T301", "T401","T501","T601","7101"};
		
		
		// 정보통신공학과의 과사무실 위치와 조교 이름음?
		
		String search = "정보통신공학과";
		int idx = -1;
		for(int k = 0; k < dept[0].length; k++) {
				if(dept[0][k].equals(search)) {
					idx =k; break;
				}
			}
		if(idx == -1) {// 학과가 존재하지않는다면?
			System.out.println("등록이 되지않은 학과입니다.");
			return; // return은 매서드를 종료 시킨다. main매서드 종료 프로그램끝
		}
		
		System.out.println("조교 :" + dept[1][idx] + ", 사무실 : " +dept[3][idx]);
		
	}

}
