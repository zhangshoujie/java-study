package com.soft2036.unit3;

/**
 * @author 张守杰
 */
public class Factor {
    public static void main(String[] args) {
        int a = 9,b = 5,c = 7,t = 0;
        if (b < a){
            t = a;
            a = b;
            b = t;
        }
        if (c < a){
            t = a;
            a = c;
            c = t;
        }
        if (c < b){
            t = c;
            c = b;
            b = t;
        }
        System.out.println("a=" + a + ",b=" + b + ",c=" + c);
    }
}
