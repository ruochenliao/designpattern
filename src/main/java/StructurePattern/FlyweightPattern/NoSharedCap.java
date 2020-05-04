package StructurePattern.FlyweightPattern;

/**
 * 相当于 UnsharedConcreteFlyweight，它关注非共享部分
 */
public class NoSharedCap implements BottleCap{
    public String getColor() {
        return null;
    }

    public String getBarCode(String differentCode) {
        return differentCode + "制作完成";
    }
}
