package oop;

import java.util.Arrays;

public class MethodTest {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.setName("f","cuk");
        System.out.println(Arrays.toString(demo1.getName()));
    }

}
class Demo1{
    String [] name;

    public void setName(String...name) { //可变参数  不规定数量限制
        this.name = name;
    }

    public String[] getName() {
        return name;
    }
}