package StructurePattern.adatorPattern;

public class BenzCarFactoryImpl implements CarFactory{
    public Car createCar() {
        Car c = new Car();
        c.setColor("blue");
        c.setName("benzi");
        return c;
    }
}
