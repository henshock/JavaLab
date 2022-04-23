package collection;

import java.util.ArrayList;//utility
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Hello");//0
		list.add("World");//1
		
		Double d = new Double(3.0);//物件型式的double
		double d1 = d.doubleValue();//透過方法把基本型別的值取出來
		//list.add(3.0);//2, double, JDK 1.5, 1.42
		//list.add(new Double(3.0));//2, double, autoboxing
		list.add("Hello");
		
		String value = "3";
		System.out.println( Integer.parseInt(value)+1);//31
		
		System.out.printf("list大小:%d%n",list.size());
		System.out.printf("第一個是:%s%n",list.get(0));//get(index)
		System.out.printf("第二個是:%s%n",list.get(1));//get(index)
		list.contains("Hello");
		//soutf : System.out.printf("%n");
		
		for(int i =0 ; i < list.size() ; i++) {
			String item = list.get(i);//shift+alt+l
			System.out.println(item);
		}
		//Iterator
		Iterator<String> it = list.iterator();//shift+alt+l
		while ( it.hasNext() ) {
			String item = it.next();//shift+alt+l,next()游標往下移,並且回傳資料
			System.out.println(item);
		}
		//foreach loop
		//list.get(0)
		System.out.println("----------foreach----------");
		for( String item   : list  ) {
			System.out.println(item);
		}
		System.out.println("-------Consumer--------");
		//anonymous class
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		System.out.println("-----Lambda----------");
		list.forEach((String t) -> {
				System.out.println(t);
			});
		list.forEach( (t) -> {
			System.out.println(t);
		});
		list.forEach( (t) -> System.out.println(t) );
		
		//method reference
		list.forEach(TestArrayList::printItemInArray);
		list.forEach(System.out::println);
		
		//old
		for (String string : list) {
			TestArrayList.printItemInArray(string);
		}
	}
	public static void printItemInArray(String item) {
		System.out.println("Method reference : "+item);
	}

}







