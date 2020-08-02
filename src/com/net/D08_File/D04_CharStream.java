package com.net.D08_File;

import java.io.*;

public class D04_CharStream {
  /*
  �ַ������ַ�����  һ���ַ���һ�������ֽڣ����Ա�֤�����Ĳ���һ���ַ���ֻ�ܲ������ı��ļ�
   Writer-->OutputStreamWriter(ת����)--->����FileWriter
   Reader-->InputStreamWriter(ת����)---->FileReader

   */
  public static void main(String[] args) throws IOException {
    String bashPath = "src/com/net/D08_File/file/ww.txt";
//    out(bashPath);
    input(bashPath);
  }

  public static void out(String bashPath) throws IOException {
    /*
    �ַ���write���������ֱ����������������������������Ҫˢ�»��棬��������ʱ���Լ����Զ�ˢ�»���
     */
    Writer out = new FileWriter(bashPath);

    out.write(99); //���һ���ַ�

    char[] ch = {'a', 'b', '��'};
    out.write(ch);  //���һ���ַ�����
    out.write(ch, 2, 1);

    out.write("�����ڿ�������ַ�����");  //���һ���ַ���
    out.write("�Ұ�java", 2, 4);

    out.flush();//ˢ�»���
    out.close();  //flush+close
  }

  public static void input(String bashPath) throws IOException {
    Reader in = new FileReader(bashPath);
    int c = 0;

    //һ�ζ�ȡһ���ַ�
    /*
    while ((c = in.read()) != -1) {
      System.out.print((char) c);
    }
    */

    //һ�ζ�ȡ����ַ�
    char[] chArr = new char[2];
    while ((c = in.read(chArr)) != -1) {
      String str = new String(chArr, 0, c);
      System.out.println(str);
    }
    in.close();
  }


  //JDK7�Ժ� IO�쳣�Ĵ���,���Զ��ر�close��  �����alt+enter  ��Ȼ����alt+enter��ݼ�
  public static void exception() {
    try (
        FileWriter out = new FileWriter("src/com/net/D08_File/file/ww.txt");
    ) {
      out.write(12);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

