package createPattern.Factory;

public class PizzaVeg extends Pizza {
    void prepare() {
        System.out.println("prepare vegetable pizza");
    }

    void bake() {
        System.out.println("bake vegetable pizza");
    }

    void cut() {
        System.out.println("cut vegetable pizza");
    }

    void box() {
        System.out.println("box vegetable pizza");
    }
}
