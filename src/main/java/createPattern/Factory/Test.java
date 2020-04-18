package createPattern.Factory;


public class Test {
    public static void main(String[] args){
        ChicagoPizzasStore chicagoPizzasStore = new ChicagoPizzasStore();
        chicagoPizzasStore.orderPizza("vegetable");
        System.out.println();
        LosAngelesPizzaStore losAngelesPizzaStore = new LosAngelesPizzaStore();
        losAngelesPizzaStore.orderPizza("vegetable");
    }
}
