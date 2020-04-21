package StructurePattern.adatorPattern;

/**
 * 类适配器
 * 每每新增一个 CarFactoryImpl, 就新增一个适配器，称为类适配器
 *
 * 通过继承 CarFactoryImpl 拥有 createCar 的能力
 */
public class CarAdaptorImpl extends AudiCarFactoryImpl implements CarAdaptor{

    public Car changeColor(Car car, String color) {
        car.setColor(color);
        return car;
    }
}
