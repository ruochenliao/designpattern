package createPattern.BuilderPattern;

public class Test {
    public static void main(String[] args){
        Worker worker = new Worker();
        Robot robot = worker.buildRobot(new SmartRobotBuilder());
        System.out.println("head:" + robot.getHead());
        System.out.println("body:" + robot.getBody());
        System.out.println("legs:" + robot.getLegs());
    }
}
