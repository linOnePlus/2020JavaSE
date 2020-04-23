package base.liucheng;

class If {
    public static void main(String[] args) {
       double a = 1-9.0/10;
        System.out.println(a);
        if (Math.abs(1-9.0/10)<0.00001){
            System.out.println("right");
        }
        String  name = "linzejia";
        String name2 = "lin"+"zejia"; // 常量优化机制 编译时自动算为linzejia
        if (name == name2)
            System.out.println("相等");
        else
            System.out.println("不相等");


    }
}
