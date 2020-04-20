package createPattern.BuilderPattern;

public class SmartRobotBuilder implements BuilderFactory{
    static Robot robot;

    static{
        robot = new Robot();
    }

    public void buildHead() {
        String head = "head";
        String smartChip = "smart";
        String combination = smartChip + " " + head;
        robot.setHead(combination);
    }

    public void buildBody() {
        robot.setBody("body");
    }

    public void buildLegs() {
        String leg = "leg";
        String combination = leg + " " + leg;
        robot.setLegs(combination);
    }

    public Robot buildRobot() {
        return robot;
    }
}
