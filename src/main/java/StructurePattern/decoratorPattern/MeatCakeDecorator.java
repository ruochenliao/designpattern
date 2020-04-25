package StructurePattern.decoratorPattern;

public class MeatCakeDecorator extends CakeDecorator{

    MeatCakeDecorator(Cake cake) {
        super(cake);
    }

    public String nameDetail() {
        return "肉类" + cake.nameDetail();
    }

    public Double price() {
        return 5.0 + cake.price();
    }
}
