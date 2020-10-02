package com.soft2036.unit4.chapter11;

public class Student {
    int number;
    Student(int n){
        number = n;
    }
    void speak(){
        System.out.println("Student类的包名是com.soft2036.unit4.chapter11,我的学号：" + number);
    }
}
