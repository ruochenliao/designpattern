package StructurePattern.ProxyPattern.dynamicPattern.form.repair;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class DynamicProxy implements InvocationHandler {

    private Object realObject;

    public DynamicProxy(Object realObject){
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("pre request method");
        method.invoke(realObject, args);
        System.out.println("after request method");
        return null;
    }
}
