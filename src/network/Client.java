package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入Server IP:");
		String ip = scanner.nextLine();
		System.out.println("請輸入Server Port:");
		int port = Integer.parseInt(scanner.nextLine());
		
		System.out.printf("連線%s:%d%n",ip,port);
		
		try(  Socket socket = new Socket(ip, port);
				InputStream is = socket.getInputStream();//shift+_alt+l
				InputStreamReader isr = new InputStreamReader(is,"UTF8");
				BufferedReader br = new BufferedReader(isr);
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os,"UTF8");
				){
			
			Thread receivingThread = new Thread(new Runnable() {	
				@Override
				public void run() {
					String line;
					try {
						while ( (line = br.readLine()) != null ) {
							System.out.printf("接收到Server:%s%n",line);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			});
			//receivingThread.setDaemon(true);
			receivingThread.start();

			
			
			
			System.out.println("請輸入傳送的文字");
			String message = scanner.nextLine();//等候使用者輸入
			while ( message != null ) {
				message = message + "\r\n";//加上換行符號,因為server是readLine()
				osw.write(message);//送出訊息到Server
				osw.flush();//buffer
				System.out.println("請輸入傳送的文字");
				message = scanner.nextLine();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}











