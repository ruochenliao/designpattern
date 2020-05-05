package createPattern.BuilderPattern;

/**
 * builder pattern 建造者模式
 *
 * 应用场景：
 * 非常复杂的对象, 关注构建细节
 *
 * 定义：
 * 建造者模式构建复杂对象就像造汽车一样，是一个一个组件一个一个步骤创建出来的
 *
 * 建造者模式和工厂模式的相同点：都是为了创建产品
 * 建造者模式和工厂模式的不同点：建造者模式更加关注细节，工厂模式只有一个建造方法
 *
 */
public class Test {
    public static void main(String[] args){
        Worker worker = new Worker();
        Robot robot = worker.buildRobot(new SmartRobotBuilder());
        System.out.println("head:" + robot.getHead());
        System.out.println("body:" + robot.getBody());
        System.out.println("legs:" + robot.getLegs());
    }
}
