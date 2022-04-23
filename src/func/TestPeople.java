package func;

import java.lang.*;//auto import
import func.*;
import interFace.Lawyer;
import interFace.Superman;

public class TestPeople {

	public static void main(String[] args) {
		
		TestFunc.add(1, 3);
		
		System.out.println("OverWeightBMI = "+People.OVER_WEIGHT_BMI);
		double b = People.BMI(80, 1.7);
		System.out.println("static bmi = "+b);
		
		
		//F5(x), F6(Step over)
		People p = new People();//id=18
		p.height = 1.7;
		p.weight = 80;
		double bmi = p.getBMI();//呼叫物件的方法
		System.out.println("BMI="+bmi);
		
		System.out.println( Math.pow(2.4, 3.5) );
		
		//static method,斜體字
		System.out.println( String.join(",", "Hello","World","Vincent")    );
		
		System.out.println(  "中文abc".length()    );//物件方法
		Superman s = new Superman();
		Lawyer lawyer  = new Lawyer() {
			@Override
			public void 訴訟() {
				System.out.println("aaa");
			}
		};
		p.打官司(lawyer);
		
	}

}
