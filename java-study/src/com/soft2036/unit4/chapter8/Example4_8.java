package com.soft2036.unit4.chapter8;

public class Example4_8 {
    public static void main(String[] args) {
        Lader.下底 = 100;
        Lader laderOne = new Lader();
        Lader laderTwo = new Lader();
        laderOne.设置上底(28);
        laderTwo.设置上底(66);
        System.out.println("laderOne的上底：" + laderOne.获取上底());
        System.out.println("laderOne的下底：" + laderOne.获取下底());
        System.out.println("laderTwo的上底：" + laderTwo.获取上底());
        System.out.println("laderTwo的下底：" + laderTwo.获取下底());
    }
}
