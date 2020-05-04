package createPattern.Factory;

/**
 * 工厂模式
 * 工厂的子类负责具体的创建具体的产品
 */
public class Test {
    public static void main(String[] args){
        ChicagoPizzasStore chicagoPizzasStore = new ChicagoPizzasStore();
        chicagoPizzasStore.orderPizza("vegetable");
        System.out.println();
        LosAngelesPizzaStore losAngelesPizzaStore = new LosAngelesPizzaStore();
        losAngelesPizzaStore.orderPizza("vegetable");
    }
}
