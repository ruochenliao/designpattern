package StructurePattern.FlyweightPattern;

/**
 * 相当于 ConcreteFlyweight，具体享元类，它关注与类整体，对于共享部分自己处理，对于非共享部分，它引入了非共享部分负责类进行处理
 */
public class SharedCap implements BottleCap{

    private String color;
    private BottleCap bottleCap;

    /**
     *
     * @param color 共享
     * @param bottleCap
     */
    public SharedCap(String color, BottleCap bottleCap) {
        this.color = color;
        this.bottleCap = bottleCap;
    }

    public String getColor() {
        return this.color;
    }

    public String getBarCode(String differentCode) {
        if(bottleCap == null){
            return "活动结束";
        }
        return bottleCap.getBarCode(differentCode);
    }
}
