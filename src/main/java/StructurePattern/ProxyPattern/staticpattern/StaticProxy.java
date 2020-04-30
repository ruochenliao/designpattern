package StructurePattern.ProxyPattern.staticpattern;

public class StaticProxy implements BuyHouse{
    BuyHouse buyHouse;

    public StaticProxy(BuyHouse buyHouse){
        this.buyHouse = buyHouse;
    }


    public void buyHouse() {
        System.out.println("选择房源");
        buyHouse.buyHouse();
        System.out.println("最后敲定购买");
    }
}
