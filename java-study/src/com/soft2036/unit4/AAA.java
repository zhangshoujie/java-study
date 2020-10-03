package com.soft2036.unit4;

public class AAA {
    private int money;
    private int getMoney(){
        return money;
    }

    public static void main(String[] args) {
        AAA exa = new AAA();
        exa.money = 3000;
        int m = exa.getMoney();
        System.out.println("money = " + m);
    }
}
