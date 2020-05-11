package reflection;

import javax.net.ssl.SSLContext;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Arrays;

public class GetMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class p = Class.forName("reflection.Person");
        Class s = Student.class;
        Method[] methods = s.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(i + "" + methods[i]);
        }
        System.out.println("----------------------------------------------------");

        Method getScore = s.getMethod("getScore", String.class);
        System.out.println(getScore.getName());
        System.out.println(getScore.getReturnType());
        System.out.println(Arrays.toString(getScore.getParameterTypes()));
        System.out.println(getScore.getReturnType());

        Method getName = s.getMethod("getName"); //拿到父类的public方法
        Method getGrade = s.getDeclaredMethod("getGrade", int.class);

        //执行public实例方法
        String s1  = "reflection";
        Class<? extends String> s1Class = s1.getClass();
        Method substring = s1Class.getMethod("substring", int.class, int.class);
        Object invoke = substring.invoke(s1, 0, 3);
        System.out.println("执行方法Public方法"+invoke.toString());

        //执行非Public实例方法
        getGrade.setAccessible(true);
        Student student = new Student();
        System.out.println("执行非public方法"+getGrade.invoke(student,1));



    }

}

class Student extends Person {
    public int getScore(String type) {
        return 99;
    }

    private int getGrade(int year) {
        return 1;
    }
}

class Person {
    public String getName() {
        return "Person";
    }

}
