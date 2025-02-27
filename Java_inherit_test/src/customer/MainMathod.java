package customer;

import java.sql.*;
import java.util.Scanner;
import java.util.Date;

import Store.*;


public class MainMathod {

	public static void main(String[] args) {

		// 바나나와 포도, 오렌지 갯수가 많을 경우
		// 바나나 - 15개, 포도 6개, 오렌지 54개
		
//		Banana [] ba = new Banana[15]
//				;
//		ba[0] = new Banana(2500, 400);
//		ba[1] = new Banana(3500, 500);
//		ba[2] = new Banana(4500, 600);
//		ba[3] = new Banana(5500, 700);
//		
//		ba[0].makeJuice();
		
		// 다형성 - 하나의 타입으로 여러 타입을 다룰 수 있다.
		// 상속 관계, implements
		
//		Fruit f = new Banana(2500, 500);
//		f.makeJuice();
//		Fruit g = new Grape(3500, 400);
//		g.makeJuice();
		
		Fruit [] menu = new Fruit[10];
	
		
		// 데이터베이스 연결하기(드라이버 로드)
		// com.mysql.cj.jdbc.Driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		// 계정 로그인 시 필요항목 - 주소, DB명, 계정명, 비밀번호
		
		String user = "jdg";
		String password = "123456";
		String url = "jdbc:mysql://localhost:3306/jdg";
		
		// 데이터베이스와 연결한 객체를 저장 해둬야 한다.
		
		Connection conn = null; // 데이터베이스 연결 객제 저장할 곳
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}
		
		// 쿼리문 작성해서 주고 받기
		// select * from store_menu1
		
		String sql = "select * from store_menu"; //조회 쿼리문

		// 작성한 쿼리문을 데이터 테이블로 보내려면 필요한것
		// Statement, PreparedStatment
		
		Statement st = null; // 쿼리문 보낼때 필요
		ResultSet rs = null; // 조회 결과를 받을때 필요
		
		try {
			st = conn.createStatement(); // 쿼리문을 전송하기 위한 준비
			rs = st.executeQuery(sql); // 쿼리문 보내고 결과 받기
			
			for(int i = 0; rs.next(); i++) {
				// rs.next()를 통해서 조회된 결과값이 존재하는지 확인
				int cost = rs.getInt("cost"); // 금액
				int cap = rs.getInt("capacity"); // 용량
				String type = rs.getString("fruit_type"); // 과일종류

				if (type.equals("Banana"))
				menu[i] = new Banana(cost, cap);
				if (type.equals("Orange"))
					menu[i] = new Orange(cost, cap);
				if (type.equals("Grape"))
					menu[i] = new Grape(cost, cap);
			}
			
			
		} catch (SQLException e) {
			System.out.println("쿼리문 조회 실패");
			e.printStackTrace();
		}
		
		
		// 데이터베이스에서 조회한 데이터들을 바나나, 포도, 오렌지 객체로 저장될 수 있게 하기
		
		
		
		
//		menu[0] = new Banana(2500, 350);
//		menu[1] = new Banana(3000, 400);
//		menu[2] = new Orange(3500, 400);
//		menu[3] = new Banana(3500, 500);
//		menu[4] = new Grape(4500, 350);
//		menu[5] = new Banana(4500, 550);
//		menu[6] = new Grape(5000, 450);
//		menu[7] = new Orange(4000, 350);
//		menu[8] = new Orange(5000, 550);
//		menu[9] = new Grape(6000, 600);		
		
//		menu[2].makeJuice();
//		menu[6].pieceFruit();
		
		Buyer ctm1 = new Buyer(10000); //첫번째 구매자 객체 생성
		
		
		for(int i = 0; i < menu.length ; i++) {
			System.out.println((i+1)+ ". " + menu[i]);
		}
		
		// 어떤 주스를 먹을거냐
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매 번호 : ");
		int num = sc.nextInt();
		
		// 결제 진행하고 언제 주스를 사먹었는지 어떤 주스인지 기록
		
		ctm1.setMoney(ctm1.getMoney() - menu[num-1].getCost());
		// 만약 5번을 선택했다면 num-1은 4니까
		// menu 배열의 4번 인덱스의 객체를 선택한것이고,
		// 해당 객체의 getCost니까 cost변수의 값을 가지고 온다.
		// cmt1.getMoney 는 get 으로 시작하는 메서드 변수의 값을 출려하니까
		// 10000을 가지고 온다.
		// 결국 10000-3500이 된다. 이것의 결과인 6500이 setMoney를 통해
		// money의 변수에 저장하게 되고 money 변수는 6500을 가지게 된다.
		
		//import
		ctm1.setBuyDate(new Date());
		ctm1.setItem(menu[num-1]);
		
		
		System.out.println(ctm1);
		
//		System.out.println("보유 머니 : " + ctm1.getMoney() + "원");
		
		
	
	}

}

/*
 	자바프로그램에서 데이터 베이스 사용하기
 	1. 데이터베이스와 연결하기 위한 드라이버 로드
 	2. 계정 로그인
 	3. 쿼리문 작성하여 주고 받기
 	
 	
 */



