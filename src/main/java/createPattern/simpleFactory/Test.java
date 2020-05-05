package createPattern.simpleFactory;

/**
 * simple factory pattern 简单工厂
 * 可以造出一种商品，这种商品可以造出一种维度的变化
 */
public class Test {
    public static void main(String[] args){
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza("vegetable");
        store.orderPizza("meat");
    }
}
