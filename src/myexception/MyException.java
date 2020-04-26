package myexception;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class MyException {
    public static void main(String[] args)  {
        byte[] lins = MyException.getByteArr("lin");
        System.out.println(Arrays.toString(lins));
        try {
            getByteArr2("lin");
        } catch (UnsupportedEncodingException e) {
            System.out.println("方法往上抛出异常了");
        }
    }
    public  static byte[] getByteArr(String s){
        try {
            return s.getBytes("GBK2");
        } catch (UnsupportedEncodingException e) {
            //System.out.println(e);
            e.printStackTrace(); //打印错误信息
            return s.getBytes();//使用默认编码
        }
    }
    public static byte[] getByteArr2(String s) throws UnsupportedEncodingException {
        return s.getBytes("gbk23");
    }
}
