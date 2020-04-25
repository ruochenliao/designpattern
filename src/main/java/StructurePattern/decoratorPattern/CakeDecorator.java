package StructurePattern.decoratorPattern;

public abstract class CakeDecorator implements Cake{
    Cake cake;

    CakeDecorator(Cake cake){
        this.cake = cake;
    }

    public String nameDetail() {
        return cake.nameDetail();
    }

    public Double price() {
        return cake.price();
    }
}
