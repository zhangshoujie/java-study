package com.soft2036.unit4.chapter5;

public class Example4_5 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("main方法中的circle的引用：" + circle);
        System.out.println("main方法中的circle的半径：" + circle.getRadius());
        Circular circular = new Circular(circle,20);
        System.out.println("circular圆锥的bottom的引用：" + circular.bottom);
        System.out.println("圆锥的bottom的半径：" + circular.getBottomRadius());
        System.out.println("圆锥的体积：" + circular.getVolme());
        double r = 8888;
        System.out.println("圆锥更改底圆bottom的半径：" + r);
    }
}
