package base.caculator;

import java.math.BigDecimal;

public class demo1 {
    public static void main(String[] args) {
        boolean a = 5>3? false:true;
        System.out.println(a);

        double b =3.0;
        double c =0.3;
        System.out.println(b-c);
        BigDecimal bigDecimalb = new BigDecimal(b);
        BigDecimal bigDecimalc = new BigDecimal(c);
        BigDecimal divide = bigDecimalb.subtract(bigDecimalc);
        System.out.println(divide);
    }
}
