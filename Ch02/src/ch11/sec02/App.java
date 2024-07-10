package ch11.sec02;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class App {

	public static void main(String[] args) {
		InetAddress ia;
		
		try {
			System.out.println("---- catch ----");
			ia = InetAddress.getByName("www.naver.com");
			System.out.println("ia=" + ia);
		} catch (UnknownHostException e) {
			System.out.println("---- catch ----");
		} finally {
			System.out.println("---- finally ----");			
		}
	}
}
