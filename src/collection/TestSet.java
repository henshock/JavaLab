package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();//linked順序,hash:hashcode
		set.add("Hello");
		set.add("World");
		//set.add(3.0);
		System.out.printf("Set大小:%d%n",set.size());
		
		boolean success = set.add("World");
		System.out.printf("Set大小:%d,第二次加World,有沒有成功%s%n",set.size(),success);
		
		boolean hasHello = set.contains("Hello");
		System.out.println(hasHello);
		
		System.out.println("-------Iterator-------");
		Iterator<String> it = set.iterator();
		while ( it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
		
	}

}
