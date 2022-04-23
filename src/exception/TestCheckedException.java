package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.ZipException;

public class TestCheckedException {

	public static void main(String[] args) throws IOException {
		//ctrl+1
		FileReader fileReader = new FileReader("c:\\java\\Hello.xxx");//FileNotFoundException
		System.out.println("done");
		
	}

}
