package base.liucheng;

/*
* 从20 加到100
* */
public class do_while {
    public static void main(String[] args) {
        int n  = 20 ;
        int m = 100 ;
        int sum = 0 ;
        do {
           sum = sum + n;
           n++;
        }while (n<=m);
        System.out.println(sum);
    }

}
