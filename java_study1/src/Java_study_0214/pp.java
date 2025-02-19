package Java_study_0214;

public class pp {

	public static void main(String[] args) {
		// 코드 연습장
		
		int [][] a = new int [][] {
			{0,1,0,0,1,0},
			{0,1,0,0,0,0},
			{0,0,0,0,1,0},
			{0,1,0,0,1,0},
		};

		int b = 2; // 입력값
		boolean t = false; 
		int c = 0; // 입력값과 대조할 값
		
		for(int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				if (a[i][k]== 0) {
					c++;
					if(t = b){
						break;
					}
				}
				if (a[i][k]== 1) {
					t = true;
				}
				
			}

			
		}
	}

}
