package com.soft2036.unit4;
import com.soft2036.unit4.Triangle;
public class Example4_14 {
    public static void main(String[] args) {
        Triangle tri = new Triangle(12,-3,100);
        tri.计算面积();
        tri.修改三边(3,4,5);
        tri.计算面积();
    }
}
