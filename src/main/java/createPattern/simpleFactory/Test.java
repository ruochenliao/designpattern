package createPattern.simpleFactory;

/**
 * simple factory pattern 简单工厂
 * 一个工厂可以构建各种各样的产品
 */
public class Test {
    public static void main(String[] args){
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza("vegetable");
        store.orderPizza("meat");
    }
}
