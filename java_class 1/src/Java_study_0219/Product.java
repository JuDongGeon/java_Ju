package Java_study_0219;

public class Product { // 상품 클래스
	
	String productName; // 상품명
	String brand; // 브랜드명
	int quantity; // 수량
	
	Product(){}
	Product(String productName,int quantity){
		this.productName = productName;
		this.quantity = quantity;
	}
	Product(String productName,	String brand,int quantity){
		this.productName=productName; 
		this.brand=brand; 
		this.quantity=quantity
				;
	}

}
