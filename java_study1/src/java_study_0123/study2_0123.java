package java_study_0123;

public class study2_0123 {

	public static void main(String[] args) {
		
		// 비트 논리 연산자
		System.out.println( 27 & 13); // and 연산 : 두 개의 2진수 값의 각 자리 *개념 ex) 27= 11011, 13 = 01101 => 11011*01101 = 01001 => 9
		System.out.println( 27 | 13); // or 연산 : 두 개의 2진수 값의 각 자리가 하나라도 1이면 1을 반영하는 개념 ex) 27= 11011, 13 = 01101 = 11111 => 31
		System.out.println( 27 ^ 13); // xor 연산 : 1과 1 또는 0과0이 만나면 0, 0과 1이 만나야 1개념 ex) 27= 11011, 13 = 01101 = 10110 => 22
	}

}
