package createPattern.abstractFactory;


public class ColdePizza extends Pizza {
    void prepare() {
        System.out.println("prepare cold pizza");
    }

    void bake() {
        System.out.println("bake cold pizza");
    }

    void cut() {
        System.out.println("cut cold pizza");
    }

    void box() {
        System.out.println("box cold pizza");
    }
}
