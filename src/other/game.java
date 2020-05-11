package other;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        System.out.println("hello please input your name");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String next = scanner.next();
            if (next.equals("cys")||next.equals("chenyishuang")) {
                while (true) {
                    System.out.println("please input your host name");
                    String next1 = scanner.next();
                    if (next1.equals("lzj")||next1.equals("linzejia")) {
                        System.out.println("聪明");
                        break;
                    } else {
                        System.out.println("stupid car");
                    }
                }
                break;
            } else {
                System.out.println("垃圾，自己名字都不知道");
            }
        }
        int random = (int) (Math.random() * 100);
        int count = 0;
        while (true) {
            System.out.println("游戏开始，输入你心中的数字 0-100之间");
            double v = scanner.nextDouble();
            if (v > random) {
                System.out.println("太大了，好笨");
            }
            if (v < random) {
                System.out.println("太小了，好笨");
            }
            count++;
            if (v == random) {
                System.out.println("猜对了,你总共用了" + count + "次");

                if (count <= 10) {
                    System.out.println("睡觉吧");
                    break;
                } else {
                    System.out.println("超过10次不能睡觉的");
                }
            }
        }
    }
}
