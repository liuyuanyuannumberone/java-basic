package com.advance.D01_Object;

import java.util.Objects;

public class Person {
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
