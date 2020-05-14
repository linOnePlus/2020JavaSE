package oop;
/*
* 静态
* */
public class Static {
    public static void main(String[] args) {
        Person a = new Person();
        a.num = 20;
        System.out.println(a.num);
        Person b = new Person();
        b.num = 30;
        System.out.println(a.num); //a和b引用指向同一个方法区
        Person.test();


    }
}
class Person{
    int testVar;
    static int num;
    static int test(){
//        testVar = 10; 不能访问非静态
       return num*10;
    }
    static {
        System.out.println("i am lin");
    }
}

class man extends Person{
     static int test(){
         System.out.println(" i am lin2");
         return  1;
    }
}