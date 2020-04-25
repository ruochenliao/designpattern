package StructurePattern.adatorPattern;

/**
 * Adaptor
 * 实现一个 typeC 转 VGA 适配器
 * 通过组合方式实现对象适配器
 */
public class Typec2Vga2 implements Vga {
    private Iphone iphone;

    public Typec2Vga2(Iphone iphone) {
        this.iphone = iphone;
    }

    public void vgaInterface() {
        if (iphone != null) {
            System.out.println("通过组合方式实现适配器功能");
            iphone.typecPhone();
            System.out.println("接收到 type-c 接口信息，信息转换成 VGA 接口中 ...");
            System.out.println("信息已经转换成 VGA 接口，显示屏可以对接。");
        }
    }
}
