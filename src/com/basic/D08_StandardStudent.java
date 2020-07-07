package com.basic;

/*
* 标准的Java类的要求:
*
*  1.所有成员变量,用private修饰  提供对应的get(获取值)和set(设置值)方法  防止外部直接使用成员变量
*      alt + insert --> Getter and Setter --> shift + ↓(选定多个属性) --> ok
   2.提供空参和满参构造
        空参:
            alt + insert --> Constructor --> select none --> ok
        满参:（赋值）
            alt + insert --> Constructor --> shift + ↓(选定多个属性) --> ok
   3. 方法中使用成员变量时，一律使用this关键字，区分成员变量和局部变量同名
* */

public class D08_StandardStudent {
    private String name;
    private String gender;
    private int age;
    static String room = "841-401";


    public static String printRoom() {
//        System.out.println(this.name); 静态的东西,只能使用静态的东西,
//        不能使用非静态的东西(静态当中,不能使用非静态
//        静态的内容,随着类的加载而加载并完成初始化
//        静态的方法,由类名直接调用,此时没有对象,而非静态的内容,属于对象,既然没有对象, 静态方法中不能使用非静态

        /*
        * 静态方法不能直接访问普通成员变量或成员方法,这是属于对象的。
          反之，成员方法可以直接访问静态变量或静态方法。
        * */

        return D08_StandardStudent.room; //静态变量只和类有关，与对象无关


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public D08_StandardStudent() {
    }

    //方法重载
    public D08_StandardStudent(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
