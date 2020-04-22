package oop;

interface JiekouInterface{
    public static  final  int num = 0;
    public abstract void print();
    static void staticMethod(){
        System.out.println("interface static method");
    }
}

public class JieKou implements JiekouInterface{

    @Override
    public void print() {
        System.out.println("hello luna");
    }

    public static void main(String[] args) {
        JieKou jieKou = new JieKou();
        jieKou.print();
        JiekouInterface.staticMethod();//不能被继承的
        JieKou.staticMethod();
    }
    static void staticMethod(){
        System.out.println("interface static method2");
    }
}