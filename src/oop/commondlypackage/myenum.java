package oop.commondlypackage;

import java.security.SecureRandom;

public class myenum {
    public static void main(String[] args) {

        Weekday day = Weekday.MON;
        if (day == Weekday.SAT || day == Weekday.SUN) {
            System.out.println("weekday");
        }
        System.out.println(Color.RED.toString());
        SecureRandom secureRandom = new SecureRandom();
        System.out.println(secureRandom.nextInt());
    }

}

enum Weekday {
    MON, TUE, WEN, THU, FRI, SUN, SAT
    //public static final MON;
}

enum Color {
    RED(1,"hong"),BLUE(2,"lan");
    int num;
    String chinese;

    private Color(int num, String chinese) {
        this.num = num;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return "Color{" +
                "chinese='" + chinese + '\'' +
                '}';
    }
}
 /*
 枚举类其实也是一个类 编译后的代码类似如下
 public  final class Weekday2 extends Enum {
    public static final Weekday2 MON = new Weekday2();
    public static final Weekday2 TUE = new Weekday2();

    private Weekday2() { }
}*/