package actionPattern.TemplateMethodPattern;

public class Coffee extends Drink{

    void addMaterialInCup() {
        System.out.println("将咖啡加入杯子中");
    }

    void addOther() {
        System.out.println("加入冰糖");
    }
}
