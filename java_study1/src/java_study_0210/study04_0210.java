package java_study_0210;

public class study04_0210 {

	public static void main(String[] args) {
		
		//숫자 배열 비교
		int [] a = new int [] {11, 20, 55};
	
		int [] b = new int [] {13, 20, 55};
		boolean isSame = true; // 같은 배열이면 true, 다르면 false

		for(int i = 0; i<a.length; i++) {
			if (a[i] != b[i])
				isSame = false;
		}
		if (isSame) {
			System.out.println("같은배열");
		} else {
			System.out.println("다른배열");
		}
		// 문자 비교
		// name1과 name2의 이름이 같은 이름인가
		char [] name1 = new char [] {'장', '동', '건'};
		char [] name2 = new char [] {'장', '둥', '건'};
		
		boolean nameSame = true;
		
		for (int i = 0; i < name1.length; i++) {
			if (name1[i] != name2[i]) {
				nameSame = false;
			}
		}
		if (nameSame) { 
			System.out.println("같은이름");
		} else {
			System.out.println("다른이름");
		}
		
		// 문자열 비교 방법 1(equals)
		// 문자열(String) 비교는 equals 를 사용하며 별도 식없이 if 사용해도됨
		String name3 = "김동건";
		String name4 = "이동건";
		if(name3.equals(name4))
			System.out.println("같은이름");
		else
			System.out.println("다른이름");
		// 문자열 비교 방법 2(compareTo)
		// compareTo 값이 0인 경우 : 두 문자열이 같다는 뜻
		// compareTo 값이 양수인 경우 : 앞에 비교하는 수의 사전적 순서가 뒤에 비교로 들어가는 수의 사전적 순서보다 뒤인 경우 ex) name3의 사전적 순서가 name4의 사전적 순서보다 뒤면 양수
		// compareTo 값이 음수인 경우 : 앞에 비교하는 수의 사전적 순서가 뒤에 비교로 들어가는 수의 사전적 순서보다 앞인 경우 ex) name3의 사전적 순서가 name4의 사전적 순서보다 앞면 음수
		
		System.out.println(name3.compareTo(name4));
		
		
		
		
	}	

}


