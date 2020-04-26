package myexception;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TryCatchFinally {
    public static void main(String[] args) {
        //getByteArray3("f");
        //test2();
        //test3();
        System.out.println(test4());
        test5();
    }

    public static byte[] getByteArray3(String s) {
        try {
            return s.getBytes("gbk332");
        } catch (UnsupportedEncodingException e) {
            System.out.println("看看后面的catch会不会执行");
            return s.getBytes();
        } catch (Exception e) {
            System.out.println("大哥执行了");
            return s.getBytes();
        }
    }

    public static int test2() {
        int i = 1;
        try {
            i++;
            throw new Exception();
        } catch (Exception e) {
            i--;
            System.out.println("catch block i = " + i);
        } finally {
            i = 10;
            System.out.println("finally block i = " + i);
        }
        return i;
    }

    public static int test3() {
        //try 语句块中有 return 语句时的整体执行顺序
        int i = 1;
        try {
            i++;
            System.out.println("try block, i = " + i);
            return i;
        } catch (Exception e) {
            i++;
            System.out.println("catch block i = " + i);
            return i;
        } finally {
            i = 10;
            System.out.println("finally block i = " + i);
        }
    }

    public static int test4() {
        //finally 语句块中有 return 语句
        int i = 1;
        try {
            i++;
            System.out.println("try block, i = " + i);
            return i;
        } catch (Exception e) {
            i++;
            System.out.println("catch block i = " + i);
            return i;
        } finally {
            i++;
            System.out.println("finally block i = " + i);
            return i;
        }
    }

    //处理运行时异常
    public  static void test5(){
        try {
            int x = 10/0;
        }catch (ArithmeticException e){
            System.out.println("处理了运行时异常");
        }
    }

}
