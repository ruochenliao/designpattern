package createPattern.BuilderPattern;


public interface BuilderFactory {
    void buildHead();
    void buildBody();
    void buildLegs();
    Robot buildRobot();
}
