package StructurePattern.bridgePattern;

import lombok.Data;

@Data
abstract class AbstractCar {
    /**
     * 关联关系，这就是交接类的桥
     * 关联的关系是弱维度，如果我们想要加颜色维度，只需要实现 color 接口，不会影响其他颜色，降低了耦合度
     * 在使用 color 的属性方法的时候，没有使用继承
     * 和适配器模式相比，更加能够抽象结构的目的
     */
    Color color;
    abstract void makeCar();
}
