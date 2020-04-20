package StructurePattern.adatorPattern;

public class CarFactoryImpl implements CarFactory{
    public Car createCar() {
        Car c = new Car();
        c.setColor("red");
        c.setName("audi");
        return c;
    }
}
