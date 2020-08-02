package com.net.D09_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class D02_Server {
  public static void main(String[] args) throws IOException {
    //创建一个ServerSocket对象--专门用于服务器
    ServerSocket server = new ServerSocket(8888);
    System.out.println("等待连接....");
    Socket socket = server.accept();
    System.out.println("连接成功....");

    InputStream in = socket.getInputStream();
    byte[] byteArray = new byte[1024 * 8];

    int len = in.read(byteArray);
    System.out.println("收到客户端" + socket.getInetAddress().getHostAddress()
        + "的信息：" + new String(byteArray, 0, len));

  /*  int len = 0;
    while ((len = in.read(byteArray)) != -1) {
      System.out.println("收到客户端" + socket.getInetAddress().getHostAddress()
          + "的信息：" + new String(byteArray, 0, len));
      System.out.println(1111);
      System.out.println(in.read(byteArray)+11111);
    }*/

    OutputStream out = socket.getOutputStream();
    out.write("主人，你好，我是服务器".getBytes());

    socket.close();
    server.close();
  }
}
