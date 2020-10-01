package com.soft2036.unit4;

/**
 * @author 张守杰
 */
public class Example4_1 {
    public static void main(String[] args) {
       XiyoujiRenwu zhubajie,sunwukong;
       zhubajie = new XiyoujiRenwu();
       sunwukong = new XiyoujiRenwu();
        }
    }
    class XiyoujiRenwu{
        float height,weight;
        String  head,ear;
        void speak(String s) {
            System.out.println(s);
        }
}
