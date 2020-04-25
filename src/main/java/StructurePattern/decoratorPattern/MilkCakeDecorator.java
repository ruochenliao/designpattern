package StructurePattern.decoratorPattern;

public class MilkCakeDecorator extends CakeDecorator{

    MilkCakeDecorator(Cake cake) {
        super(cake);
    }

    public String nameDetail() {
        return "牛奶" + cake.nameDetail();
    }

    public Double price() {
        return 2.0 + cake.price();
    }
}
