package com.net.D09_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class D01_Client {
  public static void main(String[] args) throws IOException {
    //����һ��Socket���� ����TCP���ӵĿͻ�����
    Socket socket = new Socket("127.0.0.1", 8888);
    OutputStream out = socket.getOutputStream();
    out.write("�������������԰԰����������ã�".getBytes());


    InputStream in = socket.getInputStream();
    byte[] byteArray = new byte[1024 * 8];


    int len = in.read(byteArray);
    System.out.println("�յ��������Ϣ��" + new String(byteArray,0,len));

  /*  int len = 0;
    while ((len = in.read(byteArray)) != -1) {
      System.out.println("�յ��������Ϣ��" + new String(byteArray, 0, len));
    }*/

    socket.close();
  }
}
