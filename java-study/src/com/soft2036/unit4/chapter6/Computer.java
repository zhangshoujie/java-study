package com.soft2036.unit4.chapter6;

public class Computer {
    public double getResult(double a,int ... x){
        double result;
        int sum = 0;
        for (int i = 0;i < x.length;i++){
            sum = sum + x[i];
        }
        result = a * sum;
        return result;
    }
}
