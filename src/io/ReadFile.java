package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		//JDBC
		try ( FileInputStream fis = new FileInputStream("c:/java/io_1.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				) {
			
			System.out.println("available = "+ bis.available() );
			
			int b = bis.read();//讀一個byte
			char c = (char) b;//把byte值轉成char(字)
			System.out.println("byte值="+b);//ascii table
			System.out.println(c);
			//int a = 2 /0;//ArithmeticException
			while ( (b = bis.read()) != -1   ) {
				c = (char) b;
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
