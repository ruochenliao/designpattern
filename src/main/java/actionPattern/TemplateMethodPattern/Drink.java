package actionPattern.TemplateMethodPattern;


/**
 * 定义流程顺序，并防止子类修改顺序，子类只能修改某一个步骤
 *
 * 把水煮沸 -> 把热水倒进杯子里 -> 加入原料 -> 加入其他材料
 */
public abstract class Drink {

    /**
     * 定义流程，防止子类修改顺序
     */
    final void make() {
        boilWater();
        putWaterInCup();
        addMaterialInCup();
        addOther();
    }

    public void boilWater() {
        System.out.println("把水煮沸");
    }

    public void putWaterInCup() {
        System.out.println("将水倒入杯子中");
    }

    abstract void addMaterialInCup();

    abstract void addOther();
}
