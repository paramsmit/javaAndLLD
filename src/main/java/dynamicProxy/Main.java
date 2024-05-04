package dynamicProxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String [] args){
        Man arnold = new Man("Arnold", 30, "Thal", "Austria");
        ClassLoader arnoldClassLoader = arnold.getClass().getClassLoader();
        Class[] interfaces = arnold.getClass().getInterfaces();
        Person proxyArnold = (Person) Proxy.newProxyInstance(arnoldClassLoader, interfaces, new PersonInvocationHandler(arnold));
        proxyArnold.introduce(arnold.getName());
    }
}
