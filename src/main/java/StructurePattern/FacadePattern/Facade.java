package StructurePattern.FacadePattern;


public class Facade {
    private TV tv;
    private Light light;
    private AirCondition condition;

    Facade(TV tv, Light light, AirCondition condition) {
        this.tv = tv;
        this.light = light;
        this.condition = condition;
    }

    public void openAll() {
        tv.open();
        light.open();
        condition.open();
    }

    public void closeAll() {
        tv.close();
        light.close();
        condition.close();
    }
}
