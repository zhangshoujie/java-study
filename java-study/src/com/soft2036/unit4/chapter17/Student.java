package com.soft2036.unit4.chapter17;

public class Student {
    private int age;
    public void setAge(int age){
        if (age >=7&&age <= 28){
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
}
