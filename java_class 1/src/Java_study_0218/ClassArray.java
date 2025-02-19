package Java_study_0218;

public class ClassArray {

	public static void main(String[] args) {
		// ClassArray
		
//		Member mem = new Member();
//		mem.name = "김유신";
//		mem.job = "장군";
//		mem.age	= 39;
		
//		Member [] members = new Member[5]; // 5명의 정보 저장은 가능한데 new 연산자를 통한 공간확보가 필요 
//
//		for (int i = 0; i < members.length; i++) {
//			members[i] = new Member();}
//
//		// 배열 입력
//		members[0].job = "감찰관";
//		members[0].name = "박문수";
//		members[0].age = 34;
//		members[1].job = "군인";
//		members[1].name = "이순신";
//		members[1].age = 31;
//		members[2].age = 34;
//		members[2].job = "산업스파이";
//		members[2].name = "문익점";
//
//		// 배열 출력 반복문 
//		for(int i = 0; i < members.length; i++) {
//		System.out.println(members[i].name);	
//		System.out.println(members[i].age);	
//		System.out.println(members[i].job);	
//		}

		Member info = new Member();
		
		Movie movie1 = new Movie();
		
		movie1.title = "위키드";
		movie1.release = 2024;
		movie1.genre = "뮤지컬";
		movie1.view = 1000000;
		
		System.out.println("영화 제목 : " + movie1.title);
		System.out.println("영화 장르 : " + movie1.genre);
		System.out.println("관객수 : " + movie1.view);
		System.out.println("개봉 연도 : " + movie1.release + "년");
	}

}
