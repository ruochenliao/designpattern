package StructurePattern.ProxyPattern.dynamicPattern;

import StructurePattern.ProxyPattern.staticpattern.BuyHouse;
import StructurePattern.ProxyPattern.staticpattern.BuyHouseImpl;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        BuyHouse buyHouse = (BuyHouse) Proxy.newProxyInstance(
                DynamicProxy.class.getClassLoader(),
                new Class[]{BuyHouse.class},
                new DynamicProxy(new BuyHouseImpl()));
        buyHouse.buyHouse();
    }
}
