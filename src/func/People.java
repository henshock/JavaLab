package func;

import interFace.Lawyer;

public class People {
	
	//類別屬性 靜態屬性
	final static double OVER_WEIGHT_BMI = 24;//常數,不會變動的數值
	//靜態方法(static method)不能使用物件等級的屬性,需要的資料必須從參數傳進去
	public static double BMI(double w, double h) {
		//不能使用物件等級的屬性或方法
		return w / ( h * h );
	}
	
	
	//物件
	double height;
	double weight;//0.0
	//     回傳型態    名字 ()沒有參數
	public double getBMI() {
		//方法可以使用物件的屬性
		//double bmi = weight / ( height*height);
		double bmi = People.BMI(weight, height);
		return bmi;
	}
	
	public void 打官司(Lawyer lawyer) {
		lawyer.訴訟();
	}
	
}
