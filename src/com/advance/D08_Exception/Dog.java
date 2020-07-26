package com.advance.D08_Exception;


import java.io.IOException;

//无论父类是否抛出异常
//子类都可以不抛出异常，都可以抛出任何”运行时异常“
//但是不可以抛出比父类更多的编译器异常
public class Dog extends Animal {
  @Override
  public void show() throws NullPointerException, IOException {
    super.show();
  }

  @Override
  public void method() throws ArrayIndexOutOfBoundsException, EnumConstantNotPresentException {
    super.method();
  }
}
