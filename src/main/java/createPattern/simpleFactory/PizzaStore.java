package createPattern.simpleFactory;

/**
 * 实际使用 factory 的地方
 */
public class PizzaStore {
    /**
     * 注入工厂
     */
    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory factory){
        simplePizzaFactory = factory;
    }

    public void orderPizza(String pizzaType){
        Pizza pizza = simplePizzaFactory.createPizza(pizzaType);
        System.out.println("pizza 开始准备");
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
        System.out.println("pizza 准备完成");
    }
}
