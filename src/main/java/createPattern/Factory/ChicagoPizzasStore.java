package createPattern.Factory;

/**
 * 新增加分店，不需要修改 factory 类, 只要新增 Chicago pizza store
 */
public class ChicagoPizzasStore implements PizzaFactory{
    /**
     * 如果增加 pizza 的产品种类，只需要修改自己的产品种类，而不需要修改工厂接口
     * @param pizzaType
     * @return
     */
    public Pizza createPizza(String pizzaType) {
        if ("vegetable".equals(pizzaType)) {
            return new PizzaVeg();
        }

        if ("meat".equals(pizzaType)) {
            return new PizzaMeat();
        }
        return null;
    }

    void orderPizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        System.out.println("Chicago pizza 开始准备");
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
        System.out.println("Chicago pizza 准备完成");
    }
}
