import func.TestFunc;

public class TestString {

	public static void main(String[] args) {
		
		TestFunc.add(1, 3);

		
		String name = "Vincent";//0800 from pool
		String name1 = "Vincent";//0800 from pool
		System.out.println(name == name1);//true , 0800 == 0800
		
		String name2 = new String("Vincent");//heap, not from pool
		System.out.println(name == name2);//false, 0800(pool) == 0900(自己new)
		
		String name3 = new String("Vincent");//heap, not from pool
		System.out.println(name2 == name3);//false
		
		String hello = "hello";//from pool
		String world = "world";//from pool
		String helloworld = "helloworld"; //from pool
		String helloworld2 = hello + "world"; //文字串接,另外生成一個文字叫helloworld(heap,跟你自己new是一樣作用,不會在pool內) immutable
		
		System.out.println(helloworld == helloworld2);//false,跟pool內的文字物件是不同的
		
		System.out.println(name.equals(name2));//文字內容比較用equals,true
		//length
		System.out.println("abc中文".length());// .le 長得文字的長度
		System.out.println("abc中文".indexOf("中文1"));// 3 ,如果找不到會回傳-1
		System.out.println("abc中文".contains("中文"));//true, false
		System.out.println("abc中文".substring(3));//
		System.out.println("abc中文123".substring(3,6));//
		
		double a = 123.4567890123;
		System.out.println(a);
		System.out.println( String.format("%s有NT$%12.4f元,花掉了%d元10%%%n很有錢",name, a, 10)    );
		
		
		
		
		
				
				
				
		
		
		
		

	}

}
