package oop.commondlypackage;

public class BaoZhuang {
    public static void main(String[] args) {
        Integer a = 10;
        int b =10;
        boolean c =true;
        System.out.println(a.equals(c)); //自动装箱

        Integer integer01 = new Integer(200);
        Integer integer02= Integer.valueOf(200);
        Integer integer03 = Integer.valueOf("100");

        System.out.println(integer02.intValue());

        int x=Integer.parseInt("100");
        String x2 = integer03.toString(integer03, 8);
        System.out.println(x);
        System.out.println(x2);


        Boolean aBoolean = Boolean.valueOf(true);
        Boolean bBoolean = Boolean.valueOf("ture");

        System.out.println(aBoolean.booleanValue());

        System.out.println(aBoolean.toString());


        System.out.println(integer01.getClass().getName()); //获取类名

        Character character = Character.valueOf('l');
        System.out.println(character.charValue());

        Long aLong = Long.valueOf("100");
        long l = Long.parseLong("101");
        float v = aLong.floatValue();
        String s = aLong.toString();


    }
}
