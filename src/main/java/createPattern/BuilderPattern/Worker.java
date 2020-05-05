package createPattern.BuilderPattern;

/**
 * 指挥官 Director
 */
public class Worker {
    public Robot buildRobot(BuilderFactory builderFactory){
        builderFactory.buildHead();
        builderFactory.buildBody();
        builderFactory.buildLegs();
        return builderFactory.buildRobot();
    }
}
