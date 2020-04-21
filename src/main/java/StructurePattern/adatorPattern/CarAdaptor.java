package StructurePattern.adatorPattern;

/**
 * 应用场景
 * 假如我们的软件系统需要和新的库搭配使用，但是系统的接口和库又不兼容，这时候要使用适配器模式
 *
 * 类适配器：
 * 每每新增一个 CarFactoryImpl, 就新增一个适配器，称为类适配器
 * 对象适配器
 * 只关心对象的适配
 */
public interface CarAdaptor {
    Car changeColor(Car car, String color);
}
