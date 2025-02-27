package customer;

import java.util.Date;

import Store.Fruit;

public class Buyer {

	private int money; // 가지고 있는 돈 
	private Fruit item; // 바이어가 구매한 음료 또는 컵과일 저장 변수
	private Date buyDate; // 구매일
	
	
	
	public Buyer(int money) { // Buyer 객체 생성시 동작하게 될 생성자 메서드
		this.money = money;
	}

	// private 메서드는 직접적으로 값을 못가져오기때문에 set, get 메서드가 필요
	// 마우스 오른쪽 클릭 -> Source -> Generate Getter and Setter... 클릭-> 체크박스 선택 후 피니시
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Fruit getItem() {
		return item;
	}

	public void setItem(Fruit item) {
		this.item = item;
	}
	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	@Override
	public String toString() {
		return "보유머니 : " + money + "원 " + "구매일 : " + this.buyDate + " 구매음료 : " + this.item ;
		}
	
	
	
	
	
}
