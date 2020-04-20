package oop;
/*多态的好处*/
public class Polymorphic {
    public static void main(String[] args) {
        //算税总数
        BaseTax [] taxs = {
          new tax01(6000),
          new BaseTax(3000),
          new tax02(1300)
        };

        System.out.println(getTotalTax(taxs));
    }
    public static double getTotalTax(BaseTax...taxs){
        double total = 0;
        for (BaseTax x:taxs) {
            total = total + x.getTax();
        }
        return total;
    }
}
class  BaseTax{
    protected double income;

    public BaseTax(double income){
        this.income=income;
    }

    public double getTax(){
        return income*0.1;
    }
}
class tax01 extends BaseTax{
    public tax01(double income) {
        super(income);
    }
    public double getTax(){
        if (income>5000){
            return (income-3000)*0.1;
        }
        return 0;
    }
}
class  tax02 extends  BaseTax{
    public tax02(double income) {
    super(income);
    }
    //不用交税
    public double getTax(){
        return 0 ;
    }
}