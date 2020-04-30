package StructurePattern.ProxyPattern;

import StructurePattern.ProxyPattern.dynamicPattern.DynamicProxy;
import StructurePattern.ProxyPattern.staticpattern.BuyHouse;
import StructurePattern.ProxyPattern.staticpattern.BuyHouseImpl;
import StructurePattern.ProxyPattern.staticpattern.StaticProxy;

import java.lang.reflect.Proxy;

/**
 *
 *
 * 代理模式
 *
 * 应用场景
 * 充当连接客户端和真是对象的中介者
 *
 * 定义
 * 给对象提供一个代理，并由代理对象控制对原对象的引用
 *
 * 静态代理
 * 由程序员创建的特殊工具类，在程序启动之前，编译过程中生成的 .class 文件创建出来的
 *
 * 动态代理
 * 是在程序运行时，通过反射机制创建出来的
 *
 * 优点
 * 静态代理，满足开闭原则
 *
 * 缺点
 * 静态代理，对每个
 */
public class Test {
    public static void main(String[] args) {
        //静态代理
        System.out.println("======== 没有使用代理之前 ========");
        BuyHouse b = new BuyHouseImpl();
        b.buyHouse();
        System.out.println("========使用静态代理模式之后==========");
        StaticProxy staticProxy = new StaticProxy(b);
        staticProxy.buyHouse();

        //动态代理
        System.out.println("========使用动态代理==========");
        BuyHouse dynamicProxy = (BuyHouse) Proxy.newProxyInstance(
                BuyHouse.class.getClassLoader(),
                new Class[]{BuyHouse.class},
                new DynamicProxy(b));
        dynamicProxy.buyHouse();
    }
}
