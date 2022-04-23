package network;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class TestInetAddress {

	public static void main(String[] args) {
		
		try {
			//cmd:ipconfig
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.printf("IP:%s%n",localhost.getHostAddress());
			System.out.printf("hostname:%s%n",localhost.getHostName());
			
			//www.google.com
			InetAddress google = InetAddress.getByName("www.google.com");
			System.out.printf("Google's ip %s%n",google.getHostAddress());
			
			Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
			while ( interfaces.hasMoreElements()) {
				NetworkInterface networkInterface = interfaces.nextElement();
				System.out.println(networkInterface.getDisplayName());
				Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
