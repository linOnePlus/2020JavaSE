package oop.commondlypackage;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        for (int i = 0;i<=5;i++){
            sb.append(i).append(" ").append(" l");
        }
        System.out.println(sb);
        StringBuilder sb2 = new StringBuilder("lin;");
//        sb2.deleteCharAt(sb2.length()-1);
        sb2.delete(sb2.length()-1,sb2.length());
        System.out.println(sb2);
//        System.out.println(Integer.toString(100,2));
    }
}
class test{
    boolean aBoolean;

    public boolean isaBoolean() {//注意方法 不是get
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }
}