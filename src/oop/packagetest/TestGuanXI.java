package oop.packagetest;

import oop.Protect;
import oop.QuanXian;

/**
 * 测试有无父子包关系 结果 oop和oop。packagetest不是同一个包
 *
 */
public class TestGuanXI extends QuanXian {
    public static void main(String[] args) {
        System.out.println(testProtect); //可以访问到protect变量
//        System.out.println(testDefault); 说明两个包不是同一个包，default不能被其他包下访问
    }
}
