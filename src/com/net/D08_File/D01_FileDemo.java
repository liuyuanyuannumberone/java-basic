package com.net.D08_File;

import java.io.File;

public class D01_FileDemo {
  public static void main(String[] args) {
    //file类可以读取文件或者目录信息
    //File类不能读写文件的内容，只能使用IO流类
    creaeFile();
    getFile();
    judge();
  }

  /*
      Filed的构造方法
      public File(String pathname)通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
      public File(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例。
      public File(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例。
     */
  private static void creaeFile() {
    //绝对路径：第一种
    File file1 = new File("D:\\dataPapaer\\vue\\javaData\\project\\src\\com\\net\\D08_File\\file");
    File file2 = new File("D:/dataPapaer/vue/javaData/project/src/com/net/D08_File/file");
    //System.out.println("我好:\"你好\"");  //我好:"你好" 转义字符

    //相对路径 是项目根目录     第一种
    File file3 = new File("src/com/net/D08_File/file/test.txt");
    //第二种
    File file4 = new File("src/com/net/D08_File/", "file/test.txt");
    //第三种
    File file5 = new File("src/com/net/D08_File/");
    File file6 = new File(file5, "file/test.txt");
  }

  /*
     获取文件
    public String getAbsolutePath() File的绝对路径。
   public String getPath() File构造路径。
  public String getName() 文件或目录的名称。
  public long length() 文件的长度。单位是Byte 不能操作文件夹
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

  //判断
  public static void judge() {
    File file = new File("src/com/net/D08_File/file/test.txt");
    System.out.println(file.exists());  //文件或者目录是否存在  true
    System.out.println(file.isDirectory()); //是否为目录  false
    System.out.println(file.isFile());  //是否为文件  true
  }

  //创建和删除
  /*
      public boolean createNewFile() 当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
      public boolean delete() 删除由此File表示的文件或目录。
      public boolean mkdir()  创建由此File表示的目录。
      public boolean mkdirs() 创建由此File表示的目录，包括任何必需但不存在的父目录。
  */
  public static void operate() {

  }
}
