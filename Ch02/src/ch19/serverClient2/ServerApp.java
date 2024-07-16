package ch19.serverClient2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

	public static void main(String[] args) {

		logTime("----- Server -----");

		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {

			int port = 8000;
			serverSocket = new ServerSocket(port);

			socket = serverSocket.accept();
			logTime("Socket Open");

			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			while (true) {
				String message = br.readLine();
				if (message == null) {
					break;
				}
				logTime(message);
			}

			br.close();
			isr.close();
			is.close();

			socket.close();
			logTime("Socket Close");

			serverSocket.close();
			logTime("ServerSocket Close");

		} catch (IOException e) {
			logTime("\n----- [Server] IOException -----");
			e.printStackTrace();
		} finally {

			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (isr != null) {
					isr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
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
