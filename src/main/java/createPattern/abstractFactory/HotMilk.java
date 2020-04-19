package createPattern.abstractFactory;

public class HotMilk extends Milk{
    void prepare() {
        System.out.println("prepare hot milk");
    }

    void cook() {
        System.out.println("cook hot milk");
    }

    void bottle() {
        System.out.println("bottle hot milk");
    }
}
