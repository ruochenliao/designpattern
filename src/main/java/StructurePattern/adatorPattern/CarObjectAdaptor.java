package StructurePattern.adatorPattern;

/**
 * 对象适配器，当新增工厂的时候，不需要新增适配器
 */
public class CarObjectAdaptor implements CarAdaptor{

    private AudiCarFactoryImpl audiCarFactory = new AudiCarFactoryImpl();
    private BMWCarFactoryImpl bmwCarFactory = new BMWCarFactoryImpl();

    public Car createCar(String type){
        if("audi".equals(type)){
            return audiCarFactory.createCar();
        }
        if("bmw".equals(type)){
            return bmwCarFactory.createCar();
        }
        return null;
    }

    public Car changeColor(Car car, String color) {
        car.setColor(color);
        return car;
    }
}
