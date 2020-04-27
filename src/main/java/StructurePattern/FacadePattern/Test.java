package StructurePattern.FacadePattern;

/**
 * 目的:
 * 用于简化接口，把复杂的以前隐藏在背后，只露出一个干净的外观，比如系统一键关机，一键开机
 *
 * 定义：
 * 提供统一的接口，用来访问子系统的一群接口
 *
 * 优点
 * 隐藏了子系统，减少关联对象，实现子系统与客户松耦合
 * 简化了移植性，为迁移做了很好的移植条件
 *
 * 缺点
 * 违反了开闭原则，所以最好是放到模块与模块之间的调用
 *
 */
public class Test {

    public static void main(String[] args){
        Facade facade = new Facade(new TV(), new Light(), new AirCondition());
        facade.openAll();
        facade.closeAll();
    }

}
