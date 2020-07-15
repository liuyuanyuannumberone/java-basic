package com.basic.D13_extend;

public class D03_Son extends D02_Parent {
    //子类可以继承父类的除了private和构造方法以外的内容
    String name = "lyy";

    public void show() {
        String name = "yy";
        System.out.println(name);//yy 方法内部访问变量就近原则
        System.out.println(this.name); //lyy
        System.out.println(super.name); //liuyuanyuan  父类的成员变量，如果父类没有，继续往上找
    }
}
