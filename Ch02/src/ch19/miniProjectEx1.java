package ch19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class miniProjectEx1 {
   public static void main(String[] args) {
      Socket socket = null;
      BufferedReader in = null;
      BufferedWriter out = null;
      Scanner scanner = new Scanner(System.in);

      
      String serverIpAddress = "192.168.240.5"; //192.345.1.133 // 학원노트북 학원 ip// 서버 학원컴 먼저 여기서 열기-> 상대방(내컴) 클라이언트 열기
      int port = 8000;
      
      try {
         
         socket = new Socket(serverIpAddress, port);

         in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 읽어올 준비
         out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 쓸 준비

         while (true) {
            
            System.out.print("보내기>>");
            String outMsg = scanner.nextLine();
            
            if (outMsg.equalsIgnoreCase("bye")) {
               out.write(outMsg + "\n");
               out.flush();
               break;
            }
            
            // 정상 메시지인 경우
            out.write(outMsg + "\n");
            out.flush();
            
            
            String inMsg = in.readLine();
            System.out.println("서버>> " + inMsg);
            
         }
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
            scanner.close();
            out.close();
            in.close();
            socket.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
}
