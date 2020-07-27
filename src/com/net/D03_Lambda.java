package com.net;

import javax.print.DocFlavor;

public class D03_Lambda {
  public static void main(String[] args) {
    fun(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100; i++) {
          System.out.println("iiiiiiiiii");
        }
      }
    });

    //等价于上边  lambda表达式
    //前提条件： 必须是一个接口 ，
    //接口中有且只有一个抽象方法(还可以包含和Object类中方法声明一样的)抽象方法 ---函数式接口
    fun(() -> {
      for (int i = 0; i < 100; i++) {
        System.out.println(i);
      }
    });

    //第三种
    Runnable runnable = getRun();
    fun(runnable);

  }

  public static void fun(Runnable runnable) {  //函数式接口
    Thread t = new Thread(runnable);
    t.start();
  }

  public static Runnable getRun() {

   /*
   return new Runnable() {
      @Override
      public void run() {
        System.out.println("run");
      }
    };
    */

    return () -> {
      System.out.println("run");
    };

  }
}
