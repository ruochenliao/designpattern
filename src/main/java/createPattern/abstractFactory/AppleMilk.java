package createPattern.abstractFactory;

public class AppleMilk extends Milk{
    @Override
    void prepare() {
        System.out.println("prepare apple milk");
    }

    @Override
    void cook() {
        System.out.println("cook apple milk");
    }

    @Override
    void bottle() {
        System.out.println("bottle apple milk");
    }
}
