package com.net.D08_File;

import java.io.File;

public class D01_FileDemo {
  public static void main(String[] args) {
    //file����Զ�ȡ�ļ�����Ŀ¼��Ϣ
    //File�಻�ܶ�д�ļ������ݣ�ֻ��ʹ��IO����
    creaeFile();
    getFile();
    judge();
  }

  /*
      Filed�Ĺ��췽��
      public File(String pathname)ͨ����������·�����ַ���ת��Ϊ����·�����������µ� Fileʵ����
      public File(String parent, String child) �Ӹ�·�����ַ�������·�����ַ��������µ� Fileʵ����
      public File(File parent, String child) �Ӹ�����·��������·�����ַ��������µ� Fileʵ����
     */
  private static void creaeFile() {
    //����·������һ��
    File file1 = new File("D:\\dataPapaer\\vue\\javaData\\project\\src\\com\\net\\D08_File\\file");
    File file2 = new File("D:/dataPapaer/vue/javaData/project/src/com/net/D08_File/file");
    //System.out.println("�Һ�:\"���\"");  //�Һ�:"���" ת���ַ�

    //���·�� ����Ŀ��Ŀ¼     ��һ��
    File file3 = new File("src/com/net/D08_File/file/test.txt");
    //�ڶ���
    File file4 = new File("src/com/net/D08_File/", "file/test.txt");
    //������
    File file5 = new File("src/com/net/D08_File/");
    File file6 = new File(file5, "file/test.txt");
  }

  /*
     ��ȡ�ļ�
    public String getAbsolutePath() File�ľ���·����
   public String getPath() File����·����
  public String getName() �ļ���Ŀ¼�����ơ�
  public long length() �ļ��ĳ��ȡ���λ��Byte ���ܲ����ļ���
  */
  private static void getFile() {
    File file1 = new File("D:/dataPapaer/vue/javaData/project/src/com/net/D08_File/file/test.txt");
    File file2 = new File("src/com/net/D08_File/file/test.txt");
    System.out.println(file1.getAbsolutePath());// D:\dataPapaer\vue\javaData\project\src\com\net\D08_File\file\test.txt
    System.out.println(file2.getAbsolutePath());// D:\dataPapaer\vue\javaData\project\src\com\net\D08_File\file\test.txt
    System.out.println(file1.getPath());// D:\dataPapaer\vue\javaData\project\src\com\net\D08_File\file\test.txt
    System.out.println(file2.getPath()); //  src\com\net\D08_File\file\test.txt
    System.out.println(file1.getName()); // test.txt
    System.out.println(file2.getName()); // test.txt
    System.out.println(file1.length()); // 4
    System.out.println(file2.length()); // 4
  }

  //�ж�
  public static void judge() {
    File file = new File("src/com/net/D08_File/file/test.txt");
    System.out.println(file.exists());  //�ļ�����Ŀ¼�Ƿ����  true
    System.out.println(file.isDirectory()); //�Ƿ�ΪĿ¼  false
    System.out.println(file.isFile());  //�Ƿ�Ϊ�ļ�  true
  }

  //������ɾ��
  /*
      public boolean createNewFile() ���ҽ������и����Ƶ��ļ��в�����ʱ������һ���µĿ��ļ���
      public boolean delete() ɾ���ɴ�File��ʾ���ļ���Ŀ¼��
      public boolean mkdir()  �����ɴ�File��ʾ��Ŀ¼��
      public boolean mkdirs() �����ɴ�File��ʾ��Ŀ¼�������κα��赫�����ڵĸ�Ŀ¼��
  */
  public static void operate() {

  }
}
