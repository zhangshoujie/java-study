package com.soft2036.unit3;

/**
 * @author 张守杰
 */
public class ArrayForExample {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        char b[] = {'a','b','c','d'};
        for (int n = 0;n < a.length;n++){
            System.out.println(a[n]);
        }
        for (int n = 0;n < b.length;n++){
            System.out.println(b[n]);
        }
        for (int i:a){
            System.out.println(i);
        }
        for (char ch:b){
            System.out.println(ch);
        }

    }
}
