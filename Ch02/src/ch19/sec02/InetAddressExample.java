package ch19.sec02;

import java.net.InetAddress;
import java.rmi.UnknownHostException;

public class InetAddressExample {

	public static void main(String[] args) throws java.net.UnknownHostException, UnknownHostException {
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내 컴퓨터 주소: " + local.getHostAddress());
		
		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		for(InetAddress remote : iaArr ) {
			System.out.println("www.naver.com IP주소: " + remote.getHostAddress());
		}
	}

}
