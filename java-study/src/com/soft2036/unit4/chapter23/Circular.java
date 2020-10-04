package com.soft2036.unit4.chapter23;

public class Circular {
    Circle bottom;
    double height;
    public void setBottom(Circle c){
        bottom = c;
    }
    public void setHeight(double h){
        height = h;
    }
    double getVolme(){
        return bottom.getArea() * height / 3;
    }
}
