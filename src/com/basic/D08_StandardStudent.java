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
