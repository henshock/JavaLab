package collection;

import java.util.Comparator;

public class DescComparator implements Comparator {

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
 
}
