package com.net.D09_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class D02_Server {
  public static void main(String[] args) throws IOException {
    //����һ��ServerSocket����--ר�����ڷ�����
    ServerSocket server = new ServerSocket(8888);
    System.out.println("�ȴ�����....");
    Socket socket = server.accept();
    System.out.println("���ӳɹ�....");

    InputStream in = socket.getInputStream();
    byte[] byteArray = new byte[1024 * 8];

    int len = in.read(byteArray);
    System.out.println("�յ��ͻ���" + socket.getInetAddress().getHostAddress()
        + "����Ϣ��" + new String(byteArray, 0, len));

  /*  int len = 0;
    while ((len = in.read(byteArray)) != -1) {
      System.out.println("�յ��ͻ���" + socket.getInetAddress().getHostAddress()
          + "����Ϣ��" + new String(byteArray, 0, len));
      System.out.println(1111);
      System.out.println(in.read(byteArray)+11111);
    }*/

    OutputStream out = socket.getOutputStream();
    out.write("���ˣ���ã����Ƿ�����".getBytes());

    socket.close();
    server.close();
  }
}
