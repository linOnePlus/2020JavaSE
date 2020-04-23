package base.liucheng;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i<10) {
            String next = sc.next();
            System.out.println(next);
            switch (next) {
                case "h":
                case "g":
                    System.out.println("good");
                    break;
                default:
                    System.out.println("not good");
            }
            i++;
        }
        sc.close();
    }
}
