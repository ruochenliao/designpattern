package createPattern.Factory;

/**
 * factory pattern 工厂模式
 *
 * 多个维度风格的工厂构建多维度的不同产品( Benz 工厂生产 Benz 牌汽车，BYD 生产 BYD 牌汽车)
 */
public class Test {
    public static void main(String[] args){
        ChicagoPizzasStore chicagoPizzasStore = new ChicagoPizzasStore();
        chicagoPizzasStore.orderPizza("vegetable");
        System.out.println();
        LosAngelesPizzaStore losAngelesPizzaStore = new LosAngelesPizzaStore();
        losAngelesPizzaStore.orderPizza("vegetable");
    }
}
