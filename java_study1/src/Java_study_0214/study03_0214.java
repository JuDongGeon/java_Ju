package Java_study_0214;

import java.util.Scanner;

public class study03_0214 {

	public static void main(String[] args) {
		// 문제풀기
		
		Scanner sc = new Scanner(System.in);
		
		// 문제 2
				// 알파벳 문자 하나를 입력하고 해당 알파벳으로 시작하는 단어를 모두 출력
				// 추가로 출력한 단어가 총 몇개인지 출력
				
				String[] word = new String[] {
						"apple", "banana", "cherry", "date", "elderberry", 
			            "fig", "grape", "honeydew", "kiwi", "lemon", 
			            "mango", "nectarine", "orange", "papaya", "quince", 
			            "raspberry", "strawberry", "tangerine", "ugli", "vanilla", 
			            "watermelon", "xigua", "yam", "zucchini", "avocado", 
			            "blueberry", "cantaloupe", "dragonfruit", "apricot", "blackberry", 
			            "coconut", "dragonfruit", "eggplant", "feijoa", "grapefruit", 
			            "huckleberry", "iceplant", "jackfruit", "kiwifruit", "lime", 
			            "mangosteen", "nectar", "orange", "peach", "pineapple", 
			            "pear", "plum", "pomegranate", "pear", "lime", 
			            "apricot", "banana", "papaya", "melon", "peach", 
			            "plum", "raspberry", "blueberry", "citrus", "mango", 
			            "blackcurrant", "cucumber", "fennel", "grape", "strawberry", 
			            "apricot", "blackberry", "currant", "kiwi", "orange", 
			            "lemon", "watermelon", "melon", "tangerine", "apple", 
			            "date", "elderberry", "fruit", "peach", "fruit", 
			            "apple", "cherry", "fig", "honeydew", "jackfruit", 
			            "papaya", "blueberry", "plum", "pomegranate", "grape", 
			            "avocado", "kiwi", "lemon", "watermelon", "tangerine", 
			            "strawberry", "dragonfruit", "lime", "pear", "peach"
				};
				
				System.out.print("알파벳을 입력하세요 : ");
				char alp = sc.nextLine().toLowerCase().charAt(0); // 값을 입력한 후 소문자로 변환 후 데이터 첫번째 단어만 입력
				int total = 0; // 단어의 갯수
				
				for(String str : word) { // 단순히 단어를 뽑아오는 것 반복
					if(str.charAt(0) == alp) { // 뽑아온 단어의 첫글자와 알파벳 입력값 비교
						System.out.println(str); // 적합한 단어를 출력
						total++; // 단어의 갯수 증가
					}
						
				}
				System.out.println("총 단어의 갯수 : " + total);
				
				
				
				
				
				
	}

}
