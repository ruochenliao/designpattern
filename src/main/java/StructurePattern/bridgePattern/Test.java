package StructurePattern.bridgePattern;

/**
 * 桥接模式
 *
 * 应用
 * 桥接属性，构建不同维度的对象
 *
 * 桥接模式和剪造型模式配合
 *
 *
 *
 */
public class Test {
    public static void main(String[] args){
        Benzimpl car = new Benzimpl();
        car.setColor(new Black());
        car.makeCar();

        AudiCarImpl benzi = new AudiCarImpl();
        benzi.setColor(new White());
        benzi.makeCar();
    }
}
