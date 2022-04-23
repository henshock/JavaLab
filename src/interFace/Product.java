package interFace;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Product extends Object {
	
	public static final double TAX = 0.05;
	static {
		System.out.println("Product's static block");
	}
	
	String name;
	protected int price;
	//F6, plugin
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Product() {
		
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
	//描述商品
	public String desc() {
		String message = String.format("商品名稱:%s,價錢:NT$%d元", this.name,this.price);
		return message;
	}
	//抽象方法
	//public abstract int calcTotal();
	
	public static Date getDate(int year,int month,int day) {
		GregorianCalendar calendar =  new GregorianCalendar(year, month - 1  , day);
		Date expDate = calendar.getTime();
		return expDate;
	}
	
}










