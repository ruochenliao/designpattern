package createPattern.Factory;

/**
 * factory pattern 工厂模式
 * 工厂的子类负责具体的创建具体的产品
 * 工厂模式可以造出一种商品，商品可以根据工厂的不同，每个工厂可以造出一种维度的变化
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
