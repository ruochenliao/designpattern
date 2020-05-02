package actionPattern.TemplateMethodPattern;

/**
 * template method 模板方法
 *
 * 使用场景
 * 一次性实现算法的不变部分，并将可变的行为留给子类来实现
 *
 * 定义
 * 在一个算法中定义一个算法骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤
 *
 * 模板方法是基于继承的代码复用技术，把相同代码放到父类中，而把不同代码放到子类中处理
 *
 * 可以定义模块执行顺序
 *
 * 优点
 * 模板方法模式定义了一组算法，将具体实现交于子类负责
 * 时代码复写的一种基本方法
 * 复合开闭原则
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("===============煮茶==============");
        Tea tea = new Tea();
        tea.make();
        System.out.println();
        System.out.println("===============煮咖啡==============");
        Coffee coffee = new Coffee();
        coffee.make();
    }
}
