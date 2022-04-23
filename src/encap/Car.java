package encap;

public class Car {

	private String model;// null
	private int price;//0
	private String color = "黑色";//顏色,null
	
	//constructor
	public Car(String color) {
		this("Yaris",color);
		
	}
	public Car(String model,String color) {
		this.color = color;
		setModel(model);
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
		if ( model.equals("Yaris")) {
			this.price = 575000;
		}else if ( model.equals("Prius")) {
			this.price = 1000000;
		}else {
			System.out.println("型號有錯,只能是Yaris or Prius");
		}
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getModel() {
		return model;
	}
	
	
	
}
