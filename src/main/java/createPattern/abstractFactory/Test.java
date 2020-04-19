package createPattern.abstractFactory;

public class Test {
    public static void main(String[] args){
        HotFoodFactory hotFoodFactory = new HotFoodFactory();
        //喝一杯热牛奶
        hotFoodFactory.createMilk();
        System.out.println("");
        //喝一杯冷的牛奶
        ColdFoodFactory coldFoodFactory = new ColdFoodFactory();
        coldFoodFactory.createMilk();
    }
}
