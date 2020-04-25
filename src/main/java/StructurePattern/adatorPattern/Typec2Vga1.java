package StructurePattern.adatorPattern;

/**
 * adaptor
 * 实现一个 typeC 转 VGA 适配器
 * 类的适配器模式
 */
public class Typec2Vga1 extends Iphone implements Vga{

    public void vgaInterface() {
        System.out.println("类的适配器模式");
        typecPhone();
        System.out.printf("接收到 type-c 口信息，信息转成 VGA 接口中 ...");
        System.out.println("信息已转成 VGA 接口， 显示屏可以对接");
    }
}
