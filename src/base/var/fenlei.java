package base.var;
/*
* 变量的分类
* */

public class fenlei {
    boolean c;
    float f;
    public static void main(String[] args) {
        int x = 100;
        int n = x;
        System.out.println(n);
//        int k ; 局部变量没有默认值的
//        System.out.println(f+""+c); 静态方法只能访问静态变量
        fenlei v = new fenlei();
        v.testShiLiVar();
    }
    public void testShiLiVar(){
        System.out.print(c); //访问实例变量 成员变量都有默认值
    }

    public fenlei() { }

}
