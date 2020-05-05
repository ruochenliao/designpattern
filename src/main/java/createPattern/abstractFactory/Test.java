package createPattern.abstractFactory;

/**
 * 抽象工厂类
 * 工厂可以造出多种商品，每种物品又可以有根据不同的工厂类，造出一种维度的变化
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
