package equals;

import encap.Car;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("001");//ctrl+alt+down,0800
		Employee e2 = new Employee("001");//0900
		
		System.out.println(e1);
		System.out.println(e1.toString());
		
		System.out.println(e1 == e2); //false
		//e1=17, e2=20
		System.out.println( e1.equals(e2) );//false,F3
		System.out.println("e1's hash="+e1.hashCode());
		System.out.println("e2's hash="+e2.hashCode());
		e2 = e1;
		System.out.println( e1.equals(e2) );
		e2 = null;
		System.out.println( e1.equals(e2) );
		
		e1 = null;
		System.gc();//強制建議系統執行GC!

		
		Car c = new Car("B");
		e1.equals(c);
	
	}

}
