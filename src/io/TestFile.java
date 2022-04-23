package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestFile {

	public static void main(String[] args) {
		
		File dir = new File("C:\\eclipse");
		
		File[] files = dir.listFiles();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd a HH:mm:ss");
		int counter = 0;
		long size = 0;
		Set<File> set1 = new TreeSet<File>(TestFile::sortByFileSizeAsc);
		
		Set<File> set = new TreeSet<File>((o1, o2) -> {
			if ( o1.length() < o2.length() ) {
				return -1;
			}else if ( o1.length() > o2.length() ) {
				return 1;
			}
			return 0;
		});
		List<File> list = new ArrayList<File>();
		for (File f : files) {
			long lastModified = f.lastModified();
			Date date = new Date(lastModified);
			System.out.printf("%s:%s,修改時間:%s%n", f.isDirectory()?"目錄":"檔名" , f.getName(), format.format(date) );
			if ( !f.isDirectory() ) {
				//如果是檔案
				counter++;
				size += f.length();//file.length()可以取得大小
				set.add(f);
				list.add(f);
			}
		}
		System.out.printf("檔案個數:%d,大小總和:%d%n",counter,size);
		System.out.println("-----------排序----------");
		//TreeSet, list.sort
		for (File file : set) {
			System.out.printf("檔名:%s,大小:%d%n",file.getName(),file.length());
		}
		//list.sort
		list.sort(new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				if ( o1.length() < o2.length() ) {
					return -1;
				}else if ( o1.length() > o2.length() ) {
					return 1;
				}
				return 0;
			}
		});
		System.out.println("-----------List排序----------");
		for (File file : list) {
			System.out.printf("檔名:%s,大小:%d%n",file.getName(),file.length());
		}


		
	}
	
	public static int sortByFileSizeAsc(File o1 , File o2) {
		if ( o1.length() < o2.length() ) {
			return -1;
		}else if ( o1.length() > o2.length() ) {
			return 1;
		}
		return 0;
	}

}









