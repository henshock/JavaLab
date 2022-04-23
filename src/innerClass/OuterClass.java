package innerClass;

public class OuterClass {
	
	private double height;
	private double weight;
	
	public OuterClass(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	private class InnerClass{
		public double calcBMI() {
			return weight / (height * height);
		}
	}
	
	public void printBMI() {
		InnerClass innerClass = new InnerClass();
		double bmi = innerClass.calcBMI();//shift+alt+l
		System.out.println("bmi="+bmi);
	}
	
	
	
}
