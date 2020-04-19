package createPattern.abstractFactory;

/**
 * 实物的消费场所
 */
public class Store {
    public void consume(String foodType, String temperatureLevel, String materialType) {
        if ("pizza".equals(foodType)) {
            if ("cold".equals(temperatureLevel)) {
                ColdFoodFactory coldFoodFactory = new ColdFoodFactory();
                Pizza pizza = coldFoodFactory.createPizza();
            }
            if ("hot".equals(temperatureLevel)) {
                HotFoodFactory hotFoodFactory = new HotFoodFactory();
                Pizza pizza = hotFoodFactory.createPizza();
            }
        }
        if ("milk".equals(foodType)) {
            if("cold".equals(temperatureLevel)){
                ColdFoodFactory coldFoodFactory = new ColdFoodFactory();
                Milk milk = coldFoodFactory.createMilk();
            }
            if("hot".equals(temperatureLevel)){
                HotFoodFactory hotFoodFactory = new HotFoodFactory();
                Milk milk = hotFoodFactory.createMilk();
            }
        }

    }
}
