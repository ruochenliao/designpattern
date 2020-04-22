package StructurePattern.adatorPattern;

/**
 * 应用场景
 * 两个系统接口不兼容的时候，可以考虑适配器模式
 *
 * 类适配器：
 * 每每新增一个 CarFactoryImpl, 就新增一个适配器，称为类适配器
 * 对象适配器
 * 只关心对象的适配
 */
public interface CarAdaptor {
    Car changeColor(Car car, String color);
}
