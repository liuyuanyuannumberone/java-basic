package com.basic;

public class D12_StaticKey {
    /*

 作用: 被static修饰的内容,被该类的所有对象共享使用,依赖于类,和具体的对象无关,在内存中唯一只有一份。
           修饰成员变量(类变量) 依赖于类和对象无关
                   对象名.静态成员变量名     ---不建议使用
                   类名称.静态成员变量名     ---建议使用
           修饰成员方法(类方法) 依赖于类和对象无关
                    对象名.静态成员方法名(...)     ---不建议使用
                    类名称.静态成员方法名(...)     ---建议使用
     * */

    public static void main(String[] args) {
        D08_StandardStudent stu = new D08_StandardStudent();

        System.out.println(stu); //com.basic.D08_StandardStudent@7c30a502

        System.out.println(D08_StandardStudent.room);//841-401
        System.out.println(D08_StandardStudent.printRoom());//841-401
    }
}
