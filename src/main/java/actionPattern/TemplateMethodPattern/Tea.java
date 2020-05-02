package actionPattern.TemplateMethodPattern;

public class Tea extends Drink{
    void addMaterialInCup() {
        System.out.println("将茶叶放入杯子中");
    }

    void addOther() {
        System.out.println("将入糖块");
    }
}
