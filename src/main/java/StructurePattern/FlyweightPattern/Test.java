package StructurePattern.FlyweightPattern;

import com.alibaba.fastjson.JSON;
import sun.jvm.hotspot.HelloWorld;

/**
 * FleightFactory 享元模式
 *
 * 使用共享技术，开辟静态的存储区域，将相类似的对象放入到这块静态的区域，实现相同或相似者的对象重用
 *
 * 定义
 * 运用共享技术有效地支持大量细粒度的对象的复用
 *      内部状态：不随外部环境改变而改变的共享部分
 *      外部状态：随外部环境变化而变化，不能够共享的部分称为外部状态
 * 内部状态存在对象内部，外部状态则由客户端来决定
 *
 * 使用
 * 享元模式的核心在享元工厂类，享元工厂提供一个用于存储享元对象的享元池（静态存储区域），用户需要时，从享元池中获取
 *
 * 优点
 * 极大减少系统类对象的个数
 *
 * 缺点
 * 需要区分内部状态，外部状态，增加了程序复杂度
 */
public class Test {

    public static void main(String[] args) {
        //简单享元模式,只考虑内部共享区域
        BottleCap cap1 = CapFactory.getBottleCap("red", null);
        BottleCap cap2 = CapFactory.getBottleCap("yellow", null);
        BottleCap cap3 = CapFactory.getBottleCap("green", null);
        System.out.println(cap1.getColor());
        System.out.println(cap1.getBarCode("张三的二维码"));
        BottleCap cap4 = CapFactory.getBottleCap("red", null);
        System.out.println(cap1.getColor());
        System.out.println(cap1.getBarCode("张三的二维码"));

        //复杂享元模式，考虑外部变化
        System.out.println("===============================");
        BottleCap cap5 = CapFactory.getBottleCap("red", new NoSharedCap());
        System.out.println(cap5.getColor());
        System.out.println(cap5.getBarCode("我的二维码"));
        System.out.println(cap5.getBarCode("新的二维码"));
    }
}
