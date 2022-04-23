package array;
//import array.*;

import java.util.Iterator;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee[] emps = new Employee[2];//0800
		
//		Employee emp1 = new Employee();//0900
		emps[0] = new Employee();// 0800[0] = 0900
		emps[0].empno = 1;//0800[0].empno = 1 => 0900.empno = 1
		emps[0].name = "Vincent";//0800[0].name = "V" => 0900.name = "V"
		//emps[0] = emp1;//把員工放到陣列中的第一個, 0800[0]=0900;
		
		emps[1] = new Employee();// 0800[0] = 0900
		emps[1].empno = 2;//0800[0].empno = 1 => 0900.empno = 1
		emps[1].name = "David";//0800[0].name = "V" => 0900.name = "V"
			
		System.out.println(emps[0].name+","+emps[0].empno);// 0800[0]=0900 => 0900.name
		System.out.println(emps[1].name+","+emps[1].empno);// 0800[0]=0900 => 0900.name
		
		for (int i = 0; i < emps.length; i++) {//i=0,1
			System.out.printf("員工編號:%d,姓名:%s%n",emps[i].empno,emps[i].name);
		}
		
		
	}

}
