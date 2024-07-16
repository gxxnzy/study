package ch19.serverClient;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientApp {

	public static void main(String[] args) {

		logTime("----- Client -----");

		Socket socket = null;
		try {

			String serverIp = "127.0.0.1";
			int serverPort = 8000;
			socket = new Socket(serverIp, serverPort);
			logTime("Socket Open");

			log("\t# Connection Information");
			log("\t* Local IP=[" + socket.getLocalAddress() + "]");
			log("\t* Local Port=[" + socket.getLocalPort() + "]");
			log("\t* Remote IP=[" + socket.getInetAddress() + "]");
			log("\t* Remote Port=[" + socket.getPort() + "]");

			socket.close();
			logTime("Socket Close");

		} catch (UnknownHostException e) {
			logTime("\n----- [Client] UnknownHostException -----");
			e.printStackTrace();
		} catch (IOException e) {
			logTime("\n----- [Client] IOExceptions -----");
			e.printStackTrace();
		} finally {
			try {
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void log(String message) {
		System.out.println(message);
	}

	public static void logTime(String message) {
		System.out.print("[" + DateUtil.thisTimeDotDate() + "] ");
		System.out.println(message);
	}
}
