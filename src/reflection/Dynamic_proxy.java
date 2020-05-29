package reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//运行时期动态创建接口实现类
//没搞懂
public class Dynamic_proxy {
    public static void main(String[] args) {
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("hello2")) {
                    System.out.println("这是动态代理的内容");
                }
                return null;
            }

        };
        hello h = (hello) Proxy.newProxyInstance(hello.class.getClassLoader(), new Class[]{hello.class}, invocationHandler);
        h.hello2();


        //不用内部类的写法
        InvocationHandler invocationHandler2 = new MyProxy(new helloimpl());
        hello hello3 = (hello) Proxy.newProxyInstance(hello.class.getClassLoader(), new Class[]{hello.class}, invocationHandler2);
        hello3.hello();

    }
}

interface hello {
    void hello2();

    void hello();
}

class helloimpl implements hello {

    @Override
    public void hello2() { }

    @Override
    public void hello() {
        System.out.println("hello proxy");
    }

}

class MyProxy implements InvocationHandler {

    public hello h2;

    public MyProxy(hello h2) {
        this.h2 = h2;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(h2);
        return null;
    }
}
