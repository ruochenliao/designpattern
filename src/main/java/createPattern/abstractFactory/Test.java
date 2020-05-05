package createPattern.abstractFactory;

public class Test {
    public static void main(String[] args){
        Store store = new Store();
        store.consume("pizza", "hot", "vegetable");
        System.out.println();
        store.consume("milk", "cold", "apple");
    }
}
