package createPattern.abstractFactory;

/**
 * 具体产品等级结构工厂
 *
 * 冷食品制作工厂，少了 bake 和 cook 的步骤
 * 从冷、热的维度对食品工厂进行进一步加工
 */
public class ColdFoodFactory implements Factory{
    /**
     * cold pizza 加工，不需要 bake() 阶段
     * @return
     */
    public Pizza createPizza(String type) {
        if("vegetable".equals(type)){
            PizzaVeg vegPizza = new PizzaVeg();
            vegPizza.prepare();
//        vegPizza.bake();
            vegPizza.cut();
            vegPizza.box();
            return vegPizza;
        }
        if("meat".equals(type)){
            PizzaMeat meatPizza = new PizzaMeat();
            meatPizza.prepare();
//        meatPizza.bake();
            meatPizza.cut();
            meatPizza.box();
            return meatPizza;
        }
        return null;
    }

    /**
     * 冷牛奶加工，不需要 cook() 的阶段
     * @return
     */
    public Milk createMilk(String type) {
        if("apple".equals(type)){
            AppleMilk appleMilk = new AppleMilk();
            appleMilk.prepare();
//        coldMilk.cook();
            appleMilk.bottle();
            return appleMilk;
        }
        return null;
    }
}
