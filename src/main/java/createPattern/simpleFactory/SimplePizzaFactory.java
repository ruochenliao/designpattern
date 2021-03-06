package createPattern.simpleFactory;

/**
 * 简单工厂模式：是一个静态工厂方法，属于创建型模式
 *
 * 通过调用一个简单的方法，传递一个参数，就可以返回一个相应的具体对象，这个时候就要简单工厂模式
 *
 * 缺点：不好扩展, 一旦增加产品的话，工厂类型也得增加，侵入性非常强
 */
public class SimplePizzaFactory {
    /**
     * 创建 pizza 实体
     *
     * @param pizzaType
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
}
