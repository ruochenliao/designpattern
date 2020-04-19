package createPattern.abstractFactory;

/**
 * 具体产品等级结构工厂
 *
 * 热食品制作工厂
 * 从冷、热的维度对食品工厂进行进一步加工
 */
public class HotFoodFactory implements Factory{

    public Pizza createPizza() {
        HotPizza hotPizza = new HotPizza();
        hotPizza.prepare();
        hotPizza.bake();
        hotPizza.bake();
        hotPizza.box();
        return hotPizza;
    }

    public Milk createMilk() {
        HotMilk hotMilk = new HotMilk();
        hotMilk.prepare();
        hotMilk.cook();
        hotMilk.bottle();
        return hotMilk;
    }
}
