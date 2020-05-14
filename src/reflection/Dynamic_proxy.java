package reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//运行时期动态创建接口实现类
public class Dynamic_proxy {
    public static void main(String[] args) {
        InvocationHandler invocationHandler =  new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("hello")){
                    System.out.println("这是动态代理的内容");
                }
                return  null;
            }

        };
        hello h =(hello) Proxy.newProxyInstance(hello.class.getClassLoader(), new Class[]{hello.class}, invocationHandler);
        h.hello();

    }
}

interface  hello{
    void hello();
}
