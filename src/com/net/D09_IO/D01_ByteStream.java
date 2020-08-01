package com.net.D09_IO;

import java.io.*;

public class D01_ByteStream {
  public static void main(String[] args) throws IOException {
    //
  /*
       IO流  读写文件内容
            读（读到程序里边）   （到大脑） 输入流  数据从外部到程序
            写 （程序写到外部文件）  （到纸上） 输出流  数据从程序到外边
       在磁盘的文件中，所有的数据必须转换为二进制（bit），java处理二进制的最小单位是Byte。

       java中所有的输出流构造时，文件不存在则自动创建新文件，如果存在则覆盖,追加写可以不覆盖，只追加

      字节流：字节操作 java最底层、最基本的流。操作任何文件。
        OutputStream--FileOutputStream(子类)
        InputStream--FileInputStream(子类)


      字符流：字符操作  一个字符不一定几个字节，可以保证完整的操作一个字符。
         Writer：
         Reader：
   */
    String bashPath = "src/com/net/D08_File/file/ww.txt";
    OutputStream out1 = new FileOutputStream(bashPath); //覆盖写
    OutputStream out2 = new FileOutputStream(bashPath, true); //追加写

    out2.write(97);   //a

    byte[] byteArray = {98, 99, 100};
    out2.write(byteArray);

    out2.write("你好".getBytes());  //UTF-8 一个中文占3个字节   GBK编码一个中文占2个字节


    out2.write(byteArray, 2, 1);

    System.out.println(new File(bashPath).length());
  }
}