package Java_study_0213;

public class study02_0213 {

	public static void main(String[] args) {
		// 문자열 메서드 (그나마 많이쓰는거 위주)
		
		String word = "i like melon";
		
		// 문자열에서 띄어쓰기도 하나의 인덱스로 취급됨
		System.out.println(word.charAt(7)); //charAt()는 괄호안에 숫자에 해당되는 인덱스를 추출 => 특정 문자 추출
		System.out.println(word.substring(2)); // substring() 괄호안에 숫자에 해당되는 인덱스부터 문자열 추출 => 문자열 추출
		System.out.println(word.substring(2,6)); // substring() 괄호안에 (숫자, 숫자)로 표현하면 앞에 숫자 인덱스부터 뒤에 숫자 인덱스 전까지 추출
		String temp = word.substring(2,6);
		System.out.println(temp);
		
		System.out.println(word.length()); // 문자열 길이 구하기
		
		String text = "나랏말싸미 듕귁에 달아 문자와로 서로 사맛디 아니할세";
		
		// 문자열에서 특정문자 또는 특정문자열 인덱스 구하는 방법 (int 변수 = 찾을값이 포함된 변수.indexOf(); 사용)
		int idx = text.indexOf('서');
		System.out.println(idx);
		
		idx = text.indexOf("사맛디");
		System.out.println(idx);
		
		// 예제
		// 문자와로 부터 출력
		idx = text.indexOf("문자와로");
		System.out.println(text.substring(idx));
		
		// 만약 내가 찾는 문자나 문자열이 없다면?

		idx = text.indexOf("백셩이");
		System.out.println(idx); // 값이 없다면 -1이 나옴
		
		//indexOf() 매서드를 통해 문자열에 특정 문자나 문자열이 포함되어있는지 알 수 있다.
		
		// 포함여부를 알 수 있는 매서드 (변수값.contains("포함여부를 알고 싶은 문자나 문자열")
		System.out.println(text.contains("나랏"));
		
		// 문자열 비교하는 매서드 (문자열A.equals(문자열B))
		// 결과는 true, false 로 출력됨
	
		// 문자열 분할 (변수=split("분할에 기준이 되는 공통적인 문자나 문자열")[찾을 배열 인덱스 번호] )
		text = "서경림-김현진-김미란-김석진-주동건-정수영";
		System.out.println(text.split("-")[4]);

		String[] names = text.split("-");
		System.out.println(names[3]);
		
		// 배열을 문자열로 변환 (변수 =  String.join("공통으로 들어갈 문자나 문자열",배열이름)) 
		text = String.join(",",names);
		System.out.println(text);
		
		// 대문자, 소문자 (toUpperCase(), toLowCase())
		System.out.println(word);
		System.out.println(word.toUpperCase()); // 대문자로 바꾸는거
		System.out.println(word.toLowerCase()); // 소문자로 바꾸기

		// 문자열 합치기 ( "합칠 문자나 문자열" + 합칠 기존 문자나 문자열의 변수 or "합칠 문자나 문자열".concat(합칠 기존 문자나 문자열의 변수) )
		System.out.println("abc"+word);
		System.out.println("as".concat(word));
		
		// 빈공간 판단( 변수.isBlank(), 변수.isEmpty())
		// isEmpty는 인덱스 값이 없어야 true
		// isBlank는 띄어쓰기 같은 빈공간으로 되어있는 경우도 true
		
		// 기본
		System.out.println(word.isBlank());
		System.out.println(word.isEmpty());
				
		// 가정 1(""안에 아무값도 없을때)
		word = "";		
		System.out.println(word.isBlank());
		System.out.println(word.isEmpty());

		// 가정 2(""안에 띄어쓰기를 넣었을 때)  
		word = " ";
		System.out.println(word.isBlank()); // word가 띄어쓰기로 빈공간이 되었기 때문에 true로 표현됨
		System.out.println(word.isEmpty()); // word의 인덱스가 채워졌기 때문에 false로 표현됨
		
		// 가정 3(null값으로 입력되었을때)
//		word = null; // null이 저장되어 있는 경우 문자열 관련 메서드 사용불가
//		System.out.println(word.isBlank());
//		System.out.println(word.isEmpty());
		
		// 문자열 치환 (변수=바꿀단어나 숫자가 있는 변수명.(replace.("바꿀단어나 숫자","바꾸고 싶은 단어나 숫자")
		
		word = "이현호는 바야바다";
		
		System.out.println(word.replace("바야바","돼지"));
		System.out.println(word);
		
		text = word.replace("바야바","돼지");
		System.out.println(text);
		
		word = "010.1234.5678";
		System.out.println(word.replaceAll("[0-4]", "a"));
		
		/* 정규 표현식
		 * 
		 *  . 	 임의의 문자 1개를 의미
		 *  ^ 	 시작을 의미 (^a : a로 시작하는 단어)
		 *  $ 	 $앞의 문자열로 문자가 끝나는지를 의미 (a$ : a 로 끝나는 단어를 뜻함)
		 *  - 	 사이의 문자 또는 숫자를 의미([a-z] : a 부터 z 까지 문자 확인)
		 *  					  	  ([a-z0-9] : 소문자 전체와 0부터 9까지 문자확인)
		 *  [] 	 []괄호 안에 문자가 있는지 확인하라는 뜻 ([a] : a 문자가 있는지 확인)
		 * 	[^]  []괄호 안에 ^뒤의 문자가 있으면 제외하라는 뜻 ([^a-c] : a 부터 c 까지를 제외한 문자)
		 *  | 	 또는 이라는 뜻 ([a|h] : a 또는 h 라는 문자가 있는지 확인
		 *  () 	 그룹이라 뜻 (01(0|1) : 01뒤에 0이나 1인지 확인)
		 *  {}	 개수를 의미 (a{3}b : a 가 3번나온뒤 b 가 나오는지를 확인)
		 *  			  (전화번호 정규표현식 확인 방법 ^\d{3}-\d{4}-\d{4}$
		 *  \d	 0~9를 의미
		 *  \b	 공백, 탭, /를 의미
		 *  \B	 \b 의 부정을 의미 (공백, 탭, /가 아닌 문자)
		 *  \D   \d 를 부정하는 의미 (0~9가 아닌 것)
		 *  \w 	 알파벳 대소문자 + 숫자 + _를 의미 = [a-zA-Z_0-9]
		 *  \- 	 하이픈 의미
		 */
		
		word = "toMato98731*";
		
		// 정규표현식 활용 1
		// 알파벳을 제외한 나머지를 0으로 변경
		System.out.println(word.replaceAll("[^a-zA-Z]", "0"));
		
		// 정규표현식 활용 2
		// 비밀번호 제한사항 설정 = 6자리 이상 12자리 이하 영어 소문자, 숫자 포함
		// ^[A-Za-z0-9]{6,12}$-
		
		// 정규표현식 활용 3
		// 주민등록번호 확인
		// \d{6}\-[1-4]\d{6}
	}

}
