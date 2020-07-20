package com.basic.D20_InnerClass;

public class Demo {
    public static void main(String[] args) {
        /*
        *   外部类访问内部类，建立内部类的对象
           内部类直接访问外部类
        * */
        Person p = new Person();
        Person.Heart h = new Person().new Heart();

        // 匿名内部类     BirdImp b = new BirdImp();  b.fly();
        // 创建对象调用构造方法 ，内部产生一个接口的实现类，我们看不见，相当于new 一个实现类
        // 多态 Bird b=new BirdImp();  b.fly();
        //作用：创建匿名实现类对象，并且使用多态
        Bird b = new Bird() {
            @Override
            public void fly() {
                System.out.println("飞");
            }
        };
        b.fly();
    }
}
