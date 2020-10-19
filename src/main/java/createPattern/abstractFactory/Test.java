package createPattern.abstractFactory;

/**
 * abstract factory pattern 抽象工厂类
 * 工厂可以造出多种商品，不同风格的工厂可以构建不同风格的产品, 可以有一种维度风格的变化
 *
 */
public class Test {
    public static void main(String[] args){
        StoreService storeService = new StoreService();
        storeService.consume("pizza", "hot", "vegetable");
        System.out.println();
        storeService.consume("milk", "cold", "apple");
    }
}
