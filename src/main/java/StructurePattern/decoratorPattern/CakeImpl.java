package StructurePattern.decoratorPattern;

public class CakeImpl implements Cake{

    public String nameDetail() {
        return "原味蛋糕";
    }

    public Double price() {
        return 10.0;
    }
}
