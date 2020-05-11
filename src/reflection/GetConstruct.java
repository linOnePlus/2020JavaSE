package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetConstruct {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<Integer> constructor = Integer.class.getDeclaredConstructor(int.class);
        Integer integer = constructor.newInstance(123);
        System.out.println(integer);

        Constructor<Integer> constructor1 = Integer.class.getDeclaredConstructor(String.class);
        Integer integer2 = constructor1.newInstance("1244");
        System.out.println(integer2);


    }
}
