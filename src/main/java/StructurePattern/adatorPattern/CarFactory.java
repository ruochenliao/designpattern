package StructurePattern.adatorPattern;

/**
 * 在不修改原来类的结构，通过继承原类然，再实现需要修改的接口来实现对原类进行修改的操作
 */
public interface CarFactory {
    Car createCar();
}
