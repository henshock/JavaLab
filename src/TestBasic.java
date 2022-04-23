
public class TestBasic {

	public static void main(String[] args) {
		//8 byte, 
		{
			long salary;//local variable區域變數
			salary = 50000;
			System.out.println("Salary = " + salary);//ctrl+f11, alt + up or down,String
			long salary_1 = 10000;
			char name_1 = 'A';
			long salary_2 = 10000;
			char name_2 = 'A';
			long salary_3 = 10000;
			char name_3 = 'A';
			long salary_4 = 10000;
			char name_4 = 'A';
			
		}
		int i=0;
		int j=1;
		int k=2;
		long salaryOfVincent = 2_200_000_000L;//21e, int
		int a = 2000000000 + 2000000000;//20e,overflow
		System.out.println("a=" + a);
		
		
		char b = '結';//"HelloWorld"
		System.out.println(b);//char
		boolean success = true;//true, false,//1 bit 0,1
		System.out.println(success);//boolean
		
		// Hello "Vincent"
		System.out.println("Hello \"Vincent\" \nJava\\");// \" \r\n or \n
		
		int aa = 10;
		double bb = 3;//給值
		//aa = aa + bb;//aa = 13
		aa += bb;// aa = (int) (aa + bb);
		System.out.println("aa="+aa);
		
		int cc = (int) (aa / bb);// 一定要做 / %餘數,int
		//int c = double 
		System.out.println("cc="+cc);
		
		int age = 16;
		boolean isAdult = !(age < 18 || age > 30 ); // == , !=, &&且
		System.out.println("成年?"+isAdult);
		
		System.out.println(   age >= 18 ? "成年" : "未成年"     );//if else
		
		System.out.println(12 | 6);//bitwise//&判斷, int
		System.out.println(8|1);//| 組合 8 | 1
		System.out.println( 10 << 2);//x 2 n次方
		System.out.println( 10*2*2 );
		++age; // age = age + 1
		System.out.println("age = "+  age++  +",age="+age + ++age  );
		
		System.out.println("age 2 = "+age);
		
		int sales = 2000;
		int salaryOfMary = 100;
		
		salaryOfMary = sales >= 1000 ? salaryOfMary + 10 : salaryOfMary - 10;
		
		//salaryOfMary = sales >= 1000 ? salaryOfMary + 10 : salaryOfMary -10;
		System.out.println("Mary's Salary = " + salaryOfMary);
		
		
	}

}



















