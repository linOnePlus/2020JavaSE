package oop;

public class QuanXian {
    protected static int testProtect=66666;
    static int testDefault = 3333;
    public static void main(String[] args) {
        Protect pro = new Protect();
        System.out.println(pro.name);
        System.out.println(pro.age);
        Protect.Inner inn = pro.new Inner();//如此创建内部类
        inn.getPrivate();
    }
}
class Protect {
    protected String name = "lin" ;
    int age = 1;
    private String sex;
    class Inner {
        void getPrivate(){
            System.out.println(sex); //内部类可以访问私有成员
        }
    }
}

