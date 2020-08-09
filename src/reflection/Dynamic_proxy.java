package reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//运行时期动态创建接口实现类
//没搞懂
public class Dynamic_proxy {
    public static void main(String[] args) {
        //invocationHandler是 InvocationHandler 接口实现类的子类
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args)
                    throws Throwable {
                System.out.println(method);
                if (method.getName().equals("hello")) {
                    System.out.println("this is hello method");
                }
                if (method.getName().equals("hello2")) {
                    System.out.println("这是动态代理的内容");
                }
                return null;
            }

        };
        //JDK中的Proxy类创建接口的实现类
        hello h = (hello) Proxy.newProxyInstance(hello.class.getClassLoader(),
                new Class[]{hello.class}, invocationHandler);
        //调用实现类中的方法
        h.hello();


        //不用内部类的写法
        hello hello3 = (hello) Proxy.newProxyInstance(hello.class.getClassLoader(),
                new Class[]{hello.class}, new MyProxy());
        hello3.hello();


    }
}

interface hello {
    void hello2();

    void hello();
}


class MyProxy implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这句话会不会输出，会，所以这里能动态添加一下功能");
        if (method.getName().equals("hello"))
            System.out.println("this is hello method");
        return null;
    }
}
