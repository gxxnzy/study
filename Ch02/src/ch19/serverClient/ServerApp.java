package ch19.serverClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerApp {

	public static void main(String[] args) {

		logTime("----- Server -----");

		ServerSocket serverSocket = null;
		Socket socket = null;

		try {

			int port = 8000;
			serverSocket = new ServerSocket(port);

			socket = serverSocket.accept();
			logTime("Socket Open");

			log("\t# Connection Information");
			log("\t* Local IP=[" + socket.getLocalAddress() + "]");
			log("\t* Local Port=[" + socket.getLocalPort() + "]");
			log("\t* Remote IP=[" + socket.getInetAddress() + "]");
			log("\t* Remote Port=[" + socket.getPort() + "]");

			socket.close();
			logTime("Socket Close");

			serverSocket.close();
			logTime("ServerSocket Close");

		} catch (IOException e) {
			logTime("\n----- [Server] IOException -----");
			e.printStackTrace();
		} finally {

			try {
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (serverSocket != null) {
					serverSocket.close();
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
