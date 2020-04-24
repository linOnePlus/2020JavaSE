package oop.commondlypackage;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        for (int i = 0;i<=5;i++){
            sb.append(i).append(" ").append(" l");
        }
        System.out.println(sb);
    }
}
