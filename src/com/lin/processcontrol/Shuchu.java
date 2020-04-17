package com.lin.processcontrol;

import jdk.nashorn.internal.ir.IfNode;

import java.io.IOException;
import java.util.Scanner;

public class Shuchu {
    public static void main(String[] args) {
        System.out.printf("%.2f\n", 2.323232);
        System.out.printf("%x\n", 500);
        System.out.printf("%o\n", 500);
        System.out.printf("%s\n", "sfuck");   //
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input");
        String var = scanner.nextLine();
        System.out.println(var);
        if (var.equals("cys") ) {
            System.out.println("hello");
        } else {
            System.out.println("error");
            System.out.println("git push");
            System.out.println("test hebing");
        }
        scanner.close();
    }
}
