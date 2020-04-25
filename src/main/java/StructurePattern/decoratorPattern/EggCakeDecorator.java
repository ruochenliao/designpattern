package StructurePattern.decoratorPattern;

public class EggCakeDecorator extends CakeDecorator{

    EggCakeDecorator(Cake cake) {
        super(cake);
    }

    public String nameDetail() {
        return "鸡蛋" + cake.nameDetail();
    }

    public Double price() {
        return 1.5 + cake.price();
    }
}
