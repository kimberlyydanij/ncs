package ncs.test04;

public class Product {

	String name;
	int price;
	int quantity;
	
	public Product() {
		
	}

	public Product(String name, int price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String information() {
		String data="";
		System.out.println();
		System.out.println("상품명 : "+ this.getName());
		System.out.printf("가격 : %s 원\n",this.getPrice());
		System.out.printf("수량 : %s 개\n",this.getQuantity());
		System.out.printf("총 구매 가격 : %d 원",(int)this.getPrice() * (int)this.getQuantity());
	
		return data;
	
	}

}

