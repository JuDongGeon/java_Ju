package Java_study_0117;

public class study_java0117 {

	public static void main(String[] args) {
		// 형변화 개념
		
		
		int num = 20;
		float pi = 3.14f;
		
		pi  = num; // float(실수)가 int(정수) 보다 큰 범위를 가지기 때문에 pi가 num을 가질수 있음 -> 자동 형변환
		num = (int)pi; // 강제 형변환 : int(정수)가 float(실수) 보다 작은 범위를 갖지만 (int)값을 통해 강제로 정수값만 가져서 일시적으로 나오게 표현됨
		char ch = (char)pi;
		
		
		
	}

}
