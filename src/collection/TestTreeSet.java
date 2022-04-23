package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		//DescComparator desc = new DescComparator();
		//Anonymous class,閱讀性比較高
		Comparator comparator = (o1,o2) -> {
				//指定排序規則
				Integer i1 = (Integer) o1;//Integer Object
				Integer i2 = (Integer) o2;
				System.out.printf("o1=%d,o2=%d%n",i1,i2);
				if ( i1 > i2 ) {
					return -1;//表示o1要排前面
				}else if ( i1 < i2 ) {
					return 1;//表示o1要排後面
				}else {
					return 0;//表示這兩個一樣
				}
			};
		//};
		
		Comparator c2 = (o1,o2) -> {
			return 1;
		};
		Comparator c3 = (o1,o2) -> 1;
		
		
		Set set = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				//指定排序規則
				Integer i1 = (Integer) o1;//Integer Object
				Integer i2 = (Integer) o2;
				System.out.printf("o1=%d,o2=%d%n",i1,i2);
				if ( i1 > i2 ) {
					return -1;//表示o1要排前面
				}else if ( i1 < i2 ) {
					return 1;//表示o1要排後面
				}else {
					return 0;//表示這兩個一樣
				}
			}
		});//預設是由小到大
		set.add(-2100000000);
		set.add(2000000000);
		set.add(2);
		set.add(3);
		//20e, 2 3 ,-21e
		for( Object i : set) {
			System.out.println(i);
		}
		

	}

}
