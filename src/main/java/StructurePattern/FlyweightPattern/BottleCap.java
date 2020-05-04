package StructurePattern.FlyweightPattern;

/**
 * 想当于 Flyweight，抽象享元类
 */
public interface BottleCap {
    /**
     * 内部状态
     * @return
     */
    String getColor();

    /**
     * 外部状态
     * @return
     */
    String getBarCode(String differentCode);
}
