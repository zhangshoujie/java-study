package com.soft2036.unit3;
enum Season {
    春季,夏季,秋季,冬季
}
/**
 * @author 张守杰
 */
public class SwitchExample {
    public static void main(String[] args) {
        int x =96,y=1;
        Season season = Season.春季;
        String str = new String("java语言");
        switch (x + y){
            case 1:
                System.out.println(x + y);
                break;
            case 'a':
                System.out.println(x + y);
            case 10:
                System.out.println(x + y);
                break;
            default:System.out.println("没有般配的" + (x + y));
        }
        switch (season){
            case 冬季:
                System.out.println("隆冬腊月");
            case 春季:
                System.out.println("春天种下种子");
            case 秋季:
                System.out.println("秋天收获果实");
            case 夏季:
                System.out.println("暑假真好");
        }
        switch (str){
            case "java语言":
                System.out.println("学习java语言");
            case "C语言":
                System.out.println("最好学习过C语言");
                break;
        }
    }
}
