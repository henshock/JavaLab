package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestOWriter {

	public static void main(String[] args) {
		
	
		
		try( FileOutputStream fos = new FileOutputStream("c:/java/2.txt");
			 OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
			 //BufferedWriter bw = new BufferedWriter(osw);
					 
				){
			
		
			
			osw.write("中文測試");
			osw.flush();//buffer沒滿,強制寫出
			System.out.println("done");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
