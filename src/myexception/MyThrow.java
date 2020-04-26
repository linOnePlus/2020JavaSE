package myexception;

import java.io.IOException;

public class MyThrow {
    public static void main(String[] args) throws Exception {
        int x  = -1;
        try {
           if (x < 0)
               throw new IllegalArgumentException();
        }catch (IllegalArgumentException e){
            System.out.println("输入不能负数");
        }
        try {
            testThrows();
        }finally {
            throw new Exception("异常屏蔽");//try中的异常没用了
        }
    }
    public static void testThrows() throws IOException {
        double x = 0.1;
        if (x>0)
            throw new IOException("测试一");
    }
}
