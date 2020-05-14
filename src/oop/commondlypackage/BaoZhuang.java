package oop.commondlypackage;

public class BaoZhuang {
    public static void main(String[] args) {
        // int to integer
        Integer a = 10;//自动装箱
        Integer integer01 = new Integer(200);
        Integer integer02 = Integer.valueOf(200);

        //integer to int
        int i = integer02.intValue();
        int i2 = integer02; //自动拆箱

        //string to integer
        Integer integer03 = new Integer("100");
        Integer integer04 = Integer.valueOf("100");

        //integer to string
        String s = integer01.toString();

        //string 转 int
        int i1 = Integer.parseInt("100");

        //int 转 string
        String s1 = String.valueOf(100);
        String x2 = Integer.toString(500, 8);





        //作业 bool 转 Boolean
        Boolean aBoolean = new Boolean(true);
        Boolean tr = Boolean.valueOf(true);
        Boolean bBoolean = true;

        //Boolean转bool
        boolean cBoolean = bBoolean;
        boolean dBoolean = bBoolean.booleanValue();

        //string to boolean
        boolean eBoolean = Boolean.parseBoolean("false");

        //Boolean to string
        String s2 = aBoolean.toString();

        //string to bool
        boolean aTrue = Boolean.parseBoolean("true");

        //bool to string
        String s4 = String.valueOf(aBoolean);
        String s3 = aTrue + "";
    }
}
