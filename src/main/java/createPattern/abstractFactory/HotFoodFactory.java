package createPattern.abstractFactory;

/**
 * 具体产品等级结构工厂
 *
 * 热食品制作工厂
 * 从冷、热的维度对食品工厂进行进一步加工
 */
public class HotFoodFactory implements Factory{

    public Pizza createPizza(String type) {
        if(type.equals("vegetable")){
            PizzaVeg vegPizza = new PizzaVeg();
            vegPizza.prepare();
            vegPizza.bake();
            vegPizza.box();
            return vegPizza;
        }
        return null;
    }

    public Milk createMilk(String type) {
        if(type.equals("apple")){
            AppleMilk appleMilk = new AppleMilk();
            appleMilk.prepare();
            appleMilk.cook();
            appleMilk.bottle();
            return appleMilk;
        }
        return null;
    }
}
