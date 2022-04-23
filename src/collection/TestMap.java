package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();//沒有順序,LinkedHashMap才有順序
		map.put("John", 2000);//int -> Integer
		map.put("David", 1000);
		map.put("Tom", 5000);
		map.put("Tom", 2500);
		
		
		System.out.printf("Tom's 薪水 = %d%n",map.get("Tom"));
		
		
		//取得所有的key
		Set<String> keySet = map.keySet();//shift+alt+l
		for( String key  :   keySet ) {
			System.out.printf("%s的薪水=%d%n",key,map.get(key));
		}
		System.out.println("--------Entry Set -------------");
		Set<  Entry<String, Integer>     > entrySet = map.entrySet();
		int sum = 0 ;
		for( Entry<String, Integer> entry  : entrySet ) {
			//Map.Entry entry = (Map.Entry) item;
			System.out.printf("%s的薪水=%d%n",entry.getKey(),entry.getValue());
			sum += entry.getValue();//getValue()回傳Object
		}
		
		System.out.println("總和="+sum);
		System.out.println("-------------forEach-------------");
		map.forEach(new BiConsumer<String, Integer>() {
			@Override
			public void accept(String key, Integer value) {
				System.out.printf("%s的薪水=%d%n",key,value);
			}
		});
		map.forEach((key,value) -> {
				System.out.printf("%s的薪水=%d%n",key,value);
		});
		map.forEach((key,value) -> System.out.printf("%s的薪水=%d%n",key,value));
		map.forEach(TestMap::printSalary); //Method reference
	}
	public static void printSalary(String name,Integer salary) {
		System.out.printf("%s的薪水=%d%n",name,salary);
	}

}












