package com.basic;


/*
 *
 * 成员变量 与 局部变量
 *  1.在类中的位置不同：  在类中方法外    在方法中
 *  2.在内寸中的位置不同  在堆中         栈内存
 *  3.生命周期不同：随着对象的创建而存在，随着对象的消失而消失
 *                 随着方法的调用而存在，随着方法的调用完毕而消失
 *  4.初始化值不同：有默认值  必须先定义、赋值、最后使用。
 *  5.作用范围不同：类中 方法中。
 * */
/*
 *
 * private  私有 把要保护的成员变量进行修饰, 只能在本类中直接使用
 *
 *   解决方案：    set 设置成员变量的值    set+成员变量（首字母大写），定义一个类型相同的变量，返回void
 *                get
 * */

public class D07_Student {
    String name;
    String gender;
    private int age; //成员变量，有默认值

    public void eat() {
        System.out.println(name);
    }

    public void sleep(String who) { //局部变量
        System.out.println(who);
    }

    //set 设置值
    public void setAge(int a) {
        if (a > 0 && a < 120) {
            age = a;
        }
    }

    //get 获取值
    public int getAge() {
        return age;
    }

}





