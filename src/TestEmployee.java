
public class TestEmployee {

	public static void main(String[] args) {
		int a = 1;
		//alt+shift+r : rename
		Employee emp = new Employee();//new=等於把房子蓋起來,0800
		emp.empno = 1;//. 的,屬性會有預設值,0
		emp.name = "Vincent";
		
		System.out.println("編號="+emp.empno+",姓名="+emp.name);
		
		//ctrl+alt+down: copy
		//alt+down :Move
		Employee emp2 = new Employee();//new=等於把房子蓋起來,0900
		emp2.empno = 2;//. 的,屬性會有預設值,0
		emp2.name = "Mary";
		System.out.println("編號="+emp2.empno+",姓名="+emp2.name);
		//System.out.println( a == 1 );// 1==1
		System.out.println( emp == emp2 );//false, 0800 == 0900,
		a = 2;
		emp2 = emp;// emp2 = 0800
		System.out.println("編號="+emp2.empno+",姓名="+emp2.name);
		System.out.println( emp == emp2 );//true, 0800 == 0800,
		//a = null;//會有錯

		emp = null;//null只能用在物件變數
		emp2 = null;
		if ( emp2 != null ) {//可以用 !=null做檢查
			System.out.println("編號="+emp2.empno+",姓名="+emp2.name);//會觸發NullPointerException			
		}
		System.out.println("done");
		
	}

}



