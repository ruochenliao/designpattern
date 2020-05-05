package createPattern.abstractFactory;

public class Test {
    public static void main(String[] args){
        StoreService storeService = new StoreService();
        storeService.consume("pizza", "hot", "vegetable");
        System.out.println();
        storeService.consume("milk", "cold", "apple");
    }
}
