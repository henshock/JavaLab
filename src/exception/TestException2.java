package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestException2 {

	public static void main(String[] args) {
		
		try {
			checkFile("C:/java/Hello.xxx");//f5
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	public static void checkFile(String path) throws FileNotFoundException {
		File file = new File(path);//f6
		if ( !file.exists()) {
			//產生一個FileNotFoundException物件
			//FileNotFoundException fne = new FileNotFoundException(path+"檔案不存在");
			//用throw把exception抛出
			//throw fne;
			throw new FileNotFoundException(path+"檔案不存在");
		}
		System.out.println("Check File finish");
	}
	

}





