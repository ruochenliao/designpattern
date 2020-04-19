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
    public Pizza createPizza() {
        ColdePizza coldePizza = new ColdePizza();
        coldePizza.prepare();
//        coldePizza.bake();
        coldePizza.cut();
        coldePizza.box();
        return coldePizza;
    }

    /**
     * 冷牛奶加工，不需要 cook() 的阶段
     * @return
     */
    public Milk createMilk() {
        ColdMilk coldMilk = new ColdMilk();
        coldMilk.prepare();
//        coldMilk.cook();
        coldMilk.bottle();
        return coldMilk;
    }
}
