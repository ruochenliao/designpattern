package StructurePattern.ProxyPattern.dynamicPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理需要不仅仅限制于 BuyHouse 的代理，需要包容所有的都能用这个动态代理来做代理
 */
public class DynamicProxy implements InvocationHandler {

    Object object;

    public DynamicProxy(Object object){
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过反射调用 buyHouse 的方法
        System.out.println("选择房源");
        Object o = method.invoke(object, args);
        System.out.println("最后敲定购买");
        return o;
    }
}
