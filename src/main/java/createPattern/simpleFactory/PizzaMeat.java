package createPattern.simpleFactory;

/**
 * meat pizza
 */
public class PizzaMeat extends Pizza {

    void prepare() {
        System.out.println("prepare meat pizza");
    }

    void bake() {
        System.out.println("bake meat pizza");
    }

    void cut() {
        System.out.println("cut meat pizza");
    }

    void box() {
        System.out.println("box meat pizza");
    }
}
