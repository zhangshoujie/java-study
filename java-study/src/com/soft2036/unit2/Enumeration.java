package com.soft2036.unit2;

import java.util.Scanner;
enum Season {
    春季,夏季,秋季,冬季
}
/**
 * @author 张守杰
 */
public class Enumeration {
    public static void main(String[] args) {
        Season x = null;
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        if(n == 1) {
            x = Season.春季;
        } else if (n == 2) {
            x = Season.夏季;
        } else if (n == 3) {
            x = Season.秋季;
        } else if (n == 4) {
            x = Season.冬季;
        }
            System.out.println("现在是" + x);

    }
}
