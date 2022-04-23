package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ParseCSV {

	public static void main(String[] args) {
		
		try( FileInputStream fis = new FileInputStream("c:/java/Employees.csv");
			 InputStreamReader isr = new InputStreamReader(fis,"UTF8");
			 BufferedReader br = new BufferedReader(isr);
				) {
			
			
			
			String line;			
			br.readLine();
			int sum = 0;
			while ( (line = br.readLine()) != null ) {
				System.out.println(line);
				String[] fields = line.split(",");
				System.out.printf("姓名:%s,薪水:%d%n",fields[1],Integer.parseInt(fields[2]));
				sum += Integer.parseInt(fields[2]);//文字轉數字用Wrapper class
			}
			
			System.out.println("總和="+sum);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
