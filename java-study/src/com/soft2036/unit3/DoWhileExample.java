package com.soft2036.unit3;

public class DoWhileExample {
    public static void main(String[] args) {
        double sum = 0,item = 1;
        int i = 1,n = 20;
        while (i <= n){
            sum = sum + item;
            i = i + 1;
            item = item * (1.0/i);
        }
        System.out.println("sum =" + sum);
    }
}
