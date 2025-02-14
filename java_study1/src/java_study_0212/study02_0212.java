package java_study_0212;

public class study02_0212 {

	public static void main(String[] args) {
		
		// 2차 배열 수업
		
		int[][] board = new int [5][3];
		
		board[0][0] = 1;	board[0][1] = 2;
		board[0][2] = 3;	board[1][0] = 4;
		board[1][1] = 5;	board[1][2] = 6;
		board[2][0] = 10;	board[2][1] = 11;
		board[2][2] = 12;	board[3][0] = 80;
		board[3][1] = 90;	board[3][2] = 100;
		board[4][0] = 110;	board[4][1] = 120;
		board[4][2] = 130;	
		
		for(int [] pArr : board){ 
			//pArr에 저장되는 것은 board[0], board[1], board[2], board[3], board[4]가 저장됨
			// board[0] -> 메모리 주소
			for(int num : pArr) {
				//num에 저장되는 것은 board[0][0], board[0][1], board[0][2], board[1][0] ...이 저장됨
				System.out.print(num + "  ");
			}
			
			System.out.println();
		}
		
	}

}
