package com.net.D09_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class D01_Client {
  public static void main(String[] args) throws IOException {
    //创建一个Socket对象 用在TCP连接的客户端上
    Socket socket = new Socket("127.0.0.1", 8888);
    OutputStream out = socket.getOutputStream();
    out.write("我是你的主人刘园园，服务器你好？".getBytes());


    InputStream in = socket.getInputStream();
    byte[] byteArray = new byte[1024 * 8];


    int len = in.read(byteArray);
    System.out.println("收到服务端信息：" + new String(byteArray,0,len));

  /*  int len = 0;
    while ((len = in.read(byteArray)) != -1) {
      System.out.println("收到服务端信息：" + new String(byteArray, 0, len));
    }*/

    socket.close();
  }
}
