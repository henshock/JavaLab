package encap;

public class TestCar {

	public static void main(String[] args) {
		//ctrl+shift+t open type
//		Car c = new Car("Yaris","紅色");//F5
		Car c = new Car("紅色");//F5
		
		//c.model = "Yaris";
		//c.setModel("Yaris");
		//c.price = 5000;
		//12799
		System.out.printf("型號:%s,價錢:%d,顏色:%s%n",c.getModel(),c.getPrice(),c.getColor());
		
	}
 }
