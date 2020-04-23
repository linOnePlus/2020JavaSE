package oop.commondlypackage;

public class Mystring {
    public static void main(String[] args) {
        String a = "lin";
        String b= "lin";
        System.out.println(a ==b); //比较地址值 都是指向常量池
        System.out.println(a.equals(b));

        String c = new String("abc");//创建了两个对象 一个在堆内存 一个在常量池
        String d ="abc"; //常量池
        System.out.println(c==d); //地址值肯定不同 一个堆 一个常量池
        System.out.println(c.equals(d));

        String e = "lin"+"zejia"; // 编译的时候优化机制直接变成了 linzejia
        String f = "linzejia";
        System.out.println(e==f);
        System.out.println(e.equals(f));

        String s1 = "ab";
        String s2 ="abc";
        String s3 = s1 +"c";  //编译的时候不知道s1的值？所以不存在优化机制 字符串拼接是通过stringbuffer
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));

    }
}
