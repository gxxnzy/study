package ch19.serverClient2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientApp {

	public static void main(String[] args) {

		logTime("----- Client -----");

		Socket socket = null;
		InputStreamReader isr = null;
		BufferedReader br = null; 
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		try {

			String serverIp = "192.168.240.15";
			int serverPort = 8000;
			socket = new Socket(serverIp, serverPort);
			logTime("Socket Open");

			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);

			printTime("메시지 => ");
			while (true) {
				String message = br.readLine();
				if (message == null) {
					break;
				}
				if (message.equals("quit")) {
					break;
				}
				pw.println("[iceman] " + message);
				pw.flush();
				printTime("메시지 => ");
			}

			br.close();
			isr.close();

			pw.close();
			osw.close();
			os.close();

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
			if (pw != null) {
				pw.close();
			}
			try {
				if (osw != null) {
					osw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (os != null) {
					os.close();
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
		}
	}

	public static void log(String message) {
		System.out.println(message);
	}

	public static void logTime(String message) {
		System.out.print("[" + DateUtil.thisTimeDotDate() + "] ");
		System.out.println(message);
	}

	public static void printTime(String message) {
		System.out.print("[" + DateUtil.thisTimeDotDate() + "] ");
		System.out.print(message);
	}
}
