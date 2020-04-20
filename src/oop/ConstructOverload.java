package oop;
/*构造可以重载*/
import javax.naming.Name;

public class ConstructOverload {
    public ConstructOverload(){
        System.out.println("mei");
    }
    public ConstructOverload(String name){
        System.out.println(name);
    }
    public  ConstructOverload(String name,int age){
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        ConstructOverload c = new ConstructOverload("lin");
        ConstructOverload a = new ConstructOverload("lee",3);
        ConstructOverload b = new ConstructOverload();
    }
}
