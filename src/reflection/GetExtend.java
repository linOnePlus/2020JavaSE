package reflection;

import java.util.Arrays;

public class GetExtend {
    public static void main(String[] args) {
        //获取父类
        Class<Integer> integerClass = Integer.class;
        Class<? super Integer> integerClassSuperclass = integerClass.getSuperclass();
        Class<? super Integer> integerClassSuperclassSuperclass = integerClassSuperclass.getSuperclass();
        System.out.println(integerClassSuperclass + " " + integerClassSuperclassSuperclass);

        //获取实现的接口
        Class<?>[] interfaces = integerClass.getInterfaces();
        // System.out.print("实现的接口"+ Arrays.toString(interfaces));
        for (Class i : interfaces) {
            System.out.println(i);
        }

        //获取接口的父接口
        Class<Comparable> comparableClass = Comparable.class;
        Class<?>[] interfaces1 = comparableClass.getInterfaces();
        System.out.println(Arrays.toString(interfaces1));

        //向下判断
        Integer integer = Integer.valueOf(1);
        boolean b = integer instanceof Number;
        boolean b1 = Number.class.isAssignableFrom(integer.getClass());
        boolean b2 = Object.class.isAssignableFrom(Number.class);
        System.out.println(b+" "+b1+" "+b2);
    }
}
