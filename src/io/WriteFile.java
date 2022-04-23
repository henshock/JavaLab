package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("c:/java/1.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				){
			
			String content = "中文abc";
			byte[] bytes = content.getBytes();//String轉成byte[]
			bos.write(bytes);
			
			System.out.println("done");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
