package collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestEmployeeSorting {

	public static void main(String[] args) {
		
//		Set set = new HashSet();
		Set set = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Employee emp1 = (Employee) o1;
				Employee emp2 = (Employee) o2;
				//文字轉數字
				int emp1Id = Integer.parseInt(emp1.getId());
				int emp2Id = Integer.parseInt(emp2.getId());
				if ( emp1Id < emp2Id ) {
					return -1;
				}else if ( emp1Id > emp2Id ) {
					return 1;
				}
				return 0;
			}
		});
		Employee e1 = new Employee("001");
		Employee e2 = new Employee("002");//==
		Employee e3 = new Employee("012");//==
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		System.out.printf("Set大小:%d%n",set.size());
		
		for( Object emp   :  set ) {
			System.out.println(emp);
		}
		
		

	}

}
