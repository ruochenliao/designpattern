package StructurePattern.adatorPattern;

public class AudiCarFactoryImpl implements CarFactory{
    public Car createCar() {
        Car c = new Car();
        c.setColor("red");
        c.setName("audi");
        return c;
    }
}
