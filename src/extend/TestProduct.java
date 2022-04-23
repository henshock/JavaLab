package extend;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestProduct {
	
	
	public static void main(String[] args) {
		
		Notebook nb = new Notebook("Asus", 30000, 365);
		System.out.printf("名稱:%s,價格:%d,保固天數:%d%n",nb.getName(),nb.getPrice(),nb.getWarranty());
		System.out.println(nb.name);
		System.out.println(nb.desc());
		
		Product item = nb;//notebook是一種product
		System.out.println(item.desc());//Product.desc()
		//喜歡用父類的方法 Product.desc()去操作子類Notebook的物件
		//item.getWarranty();//選不到
		Notebook item3 = (Notebook) item;//把Product轉成Notebook,???
		if (  item instanceof Food ) {//先檢查才做轉型
			Food item4 = (Food)item;//Product轉成Food, ???? Casting
		}
		//111.3.5,日曆,從日曆才能轉成java.util.Date
		GregorianCalendar calendar =  new GregorianCalendar(2022, Calendar.MARCH  , 15);//西元暦2022.3.15,月份0起算
		Date expDate = calendar.getTime();
		Food food = new Food("肉圓", 50, expDate );
		System.out.println(food.desc());
		
		Product[] products = { nb , food };
		
		buy(products);
		
	}
	
	public static void buy(Product[] ps) {
		int sum = 0;
		for (Product product : ps) {
			System.out.println("買入"+product.desc());
			sum += product.getPrice();
		}
		System.out.println("總金額:"+sum);
	}
	

}









