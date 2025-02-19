package Java_study_0206;

import java.util.Scanner;

public class java_hw2_0206 {

	public static void main(String[] args) {
		// 2/6 과제
//	    오늘 의 과제  
//	     베스킨라빈스 31 게임 만들기
//	     나와 컴퓨터 둘이서 진행 
//	     31을 제시하는 쪽이 패배 
//	     나 부터 시작 한다. 
//	     숫자 몇개를 제시할것인지 갯수를 입력하면 자동으로 숫자가 나온다.
//	     컴퓨터는 랜덤을 이용해서 몇개 제시할것인지 해야한다.
//	     숫자는 1개 부터 3개까지 가능
		
		Scanner sc = new Scanner(System.in);
		
		
	 	int win=0, lose=0, draw=0;
	 	while(true){
	 		System.out.print("1.가위  2.바위  3.보  : ");
			int me = sc.nextInt(); // 키보드를 통해 입력
			int com = (int)(Math.random() * 3 + 1);
			if(me == com ) { // 서로 같은 값이면 비김
				System.out.println("비김");draw++;
			}else if( (me==1 && com==3) || (me==2 && com==1) 
					|| (me==3 && com==2)) {
				System.out.println("이김"); win++;
			}else {
				System.out.println("패배..."); lose++;
			}
			if(win==10) break;
	 	}
	 	System.out.println("패배 : "+lose + "  비김 : "+ draw);

	}

}
