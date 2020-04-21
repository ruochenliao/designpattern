package StructurePattern.adatorPattern;

public class BMWCarFactoryImpl implements CarFactory{
    public Car createCar() {
        Car c = new Car();
        c.setColor("white");
        c.setName("BMW");
        return c;
    }
}
