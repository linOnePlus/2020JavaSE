package base.liucheng;

public class For {
    public static void main(String[] args) {
       /* for(;;){
            System.out.println("1");
        }

         for(int i = 1;;){
            System.out.println("1");
        }
          for(int i = 1;;i++){
            System.out.println("i");
        }
      //死循环
        */
        for(int i = 1;i<5;i++){
            if (i==3) {
                continue; //结束本次
            }
            System.out.println(i);
        }

    }
}
