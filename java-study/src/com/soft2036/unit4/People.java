package com.soft2036.unit4;

public class People {
    int leg,hand;
    String name;
    People(String s){
        name = s;
        this.init();
    }
    void init(){
        leg = 2;
        hand = 2;
        System.out.println(name + "有" + hand + "只手" + leg + "条腿");
    }

    public static void main(String[] args) {
        People boshi = new People("布什");
    }
}
