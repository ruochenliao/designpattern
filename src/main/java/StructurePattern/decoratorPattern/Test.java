package StructurePattern.decoratorPattern;

/**
 * 定义：在不必改变原类文件，使用继承动态地扩展一个对象的功能。
 *      它是通过创建一个包装对象，也就是装饰来包裹真是的对象。
 *
 * 适配器模式和装饰器模式的区别
 * 适配器模式的意义是将一个接口转变成另外一个接口，它的目的是通过改变接口来达到重复使用的目的
 * 装饰器模式包装不是为了改变接口，而是改变原来对象的处理方式而新增功能，提升性能
 *
 */
public class Test {

    //建立 main 函数快速方法， psvm
    public static void main(String[] args) {
        System.out.println("打印原味 cake");
        CakeImpl originalCake = new CakeImpl();
        String originalCakeName = originalCake.nameDetail();
        Double originalCakePrice = originalCake.price();
        System.out.println(originalCakeName);
        System.out.println(originalCakePrice);

        System.out.println();

        System.out.println("打印组合 cake");
        EggCakeDecorator eggCake = new EggCakeDecorator(originalCake);
        MilkCakeDecorator milkCake = new MilkCakeDecorator(eggCake);
        MeatCakeDecorator meatCake = new MeatCakeDecorator(milkCake);
        String compositeName = meatCake.nameDetail();
        Double compositePrice = meatCake.price();
        //答应出 肉类牛奶鸡蛋原味蛋糕
        System.out.println(compositeName);
        System.out.println(compositePrice);
    }
}
