package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		System.out.println("Server啟動");
		//ipconfig:172.22.1.99
		try( ServerSocket ssocket = new ServerSocket(8080);
			 Socket socket = ssocket.accept();//代表連線的件
			//假設雙方都是UTF8編碼,讀取讀一行readLine(),寫一行出去
			InputStream is = socket.getInputStream();//shift+_alt+l
			InputStreamReader isr = new InputStreamReader(is,"UTF8");
			BufferedReader br = new BufferedReader(isr);
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os,"UTF8");
				) {
			//印出誰連進來的
			InetSocketAddress remote =  (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.printf("Client: %s%n",remote.getHostName());
			
			Scanner scanner = new Scanner(System.in);
			Thread receivingThread = new Thread(new Runnable() {	
				@Override
				public void run() {
					String line;
					try {
						while ( (line = br.readLine()) != null ) {
							System.out.printf("接收到Client:%s%n",line);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			});
			//receivingThread.setDaemon(true);
			receivingThread.start();
			
			String response = scanner.nextLine() ;
			while ( response != null ) {
				osw.write(response+"\r\n");//回應訊息
				osw.flush();//因為buffer沒有滿,馬上flush,對方才能收到訊息
				response = scanner.nextLine() ;
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		

	}

}






