package com.net.D09_IO;

import java.io.*;

public class D01_ByteStream {
  public static void main(String[] args) throws IOException {
    //
  /*
       IO��  ��д�ļ�����
            ��������������ߣ�   �������ԣ� ������  ���ݴ��ⲿ������
            д ������д���ⲿ�ļ���  ����ֽ�ϣ� �����  ���ݴӳ������
       �ڴ��̵��ļ��У����е����ݱ���ת��Ϊ�����ƣ�bit����java��������Ƶ���С��λ��Byte��

       java�����е����������ʱ���ļ����������Զ��������ļ�����������򸲸�,׷��д���Բ����ǣ�ֻ׷��

      �ֽ������ֽڲ��� java��ײ㡢����������������κ��ļ���
        OutputStream--FileOutputStream(����)
        InputStream--FileInputStream(����)


      �ַ������ַ�����  һ���ַ���һ�������ֽڣ����Ա�֤�����Ĳ���һ���ַ���
         Writer��
         Reader��
   */
    String bashPath = "src/com/net/D08_File/file/ww.txt";
    OutputStream out1 = new FileOutputStream(bashPath); //����д
    OutputStream out2 = new FileOutputStream(bashPath, true); //׷��д

    out2.write(97);   //a

    byte[] byteArray = {98, 99, 100};
    out2.write(byteArray);

    out2.write("���".getBytes());  //UTF-8 һ������ռ3���ֽ�   GBK����һ������ռ2���ֽ�


    out2.write(byteArray, 2, 1);

    System.out.println(new File(bashPath).length());
  }
}