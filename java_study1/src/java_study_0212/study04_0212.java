package java_study_0212;

import java.util.Arrays;

public class study04_0212 {

	public static void main(String[] args) {
		// 3차원 배열
		
		int [][][]arr = new int [3][2][2];
		arr [0][0][0] = 10;
		arr [0][1][0] = 20;
		arr [0][1][1] = 30;
		arr [1][0][0] = 50;
		arr [1][0][1] = 60;
		arr [2][0][0] = 100;

	System.out.println(Arrays.toString(arr[0][1]));
	
	for (int i = 0; i<arr.length; i++) {
		for (int k = 0; k <arr[i].length; k++) {
			for (int j=0; j<arr[i][k].length;j++) {
				System.out.println(arr[i][k][j]);
			}
		}
	}
	}

}
