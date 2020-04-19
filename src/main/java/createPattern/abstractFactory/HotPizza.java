package createPattern.abstractFactory;

/**
 * meat pizza
 */
public class HotPizza extends Pizza {

    void prepare() {
        System.out.println("prepare hot pizza");
    }

    void bake() {
        System.out.println("bake hot pizza");
    }

    void cut() {
        System.out.println("cut hot pizza");
    }

    void box() {
        System.out.println("box hot pizza");
    }
}
