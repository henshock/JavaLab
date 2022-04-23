package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("https://www.boehringer-ingelheim.tw/sites/tw/files/images/tw_file/2_0.jpg");
		
		try ( InputStream is = url.openStream();
			  BufferedInputStream bis = new BufferedInputStream(is);
			  FileOutputStream fos = new FileOutputStream("c:/java/2.jpg");
			  BufferedOutputStream bos = new BufferedOutputStream(fos);
				) {
			
			//java inputstream to outputstream
			byte[] buffer = new byte[1024];
			int length;
			while ( (length= bis.read(buffer)) != -1 ) {
				System.out.println("length="+length);
				bos.write(buffer,0,length);
			}
			
			System.out.println("done");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
