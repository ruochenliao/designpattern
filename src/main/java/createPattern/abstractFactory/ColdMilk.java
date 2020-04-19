package createPattern.abstractFactory;

public class ColdMilk extends Milk{
    void prepare() {
        System.out.println("prepare cold milk");
    }

    void bottle() {
        System.out.println("bottle cold milk");
    }
}
