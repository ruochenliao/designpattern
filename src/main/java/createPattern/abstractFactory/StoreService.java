package createPattern.abstractFactory;

/**
 * 实物的消费场所
 */
public class StoreService {
    public void consume(String foodType, String temperatureLevel, String materialType) {
        if ("pizza".equals(foodType)) {
            if ("cold".equals(temperatureLevel)) {
                ColdFoodFactory coldFoodFactory = new ColdFoodFactory();
                Pizza pizza = coldFoodFactory.createPizza(materialType);
            }
            if ("hot".equals(temperatureLevel)) {
                HotFoodFactory hotFoodFactory = new HotFoodFactory();
                Pizza pizza = hotFoodFactory.createPizza(materialType);
            }
        }
        if ("milk".equals(foodType)) {
            if("cold".equals(temperatureLevel)){
                ColdFoodFactory coldFoodFactory = new ColdFoodFactory();
                Milk milk = coldFoodFactory.createMilk(materialType);
            }
            if("hot".equals(temperatureLevel)){
                HotFoodFactory hotFoodFactory = new HotFoodFactory();
                Milk milk = hotFoodFactory.createMilk(materialType);
            }
        }

    }
}
