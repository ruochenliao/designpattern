package StructurePattern.adatorPattern;

import com.alibaba.fastjson.JSON;

/**
 * 工厂目前已经稳定在生产环境
 * 问题：客户要求共产对车辆进行喷漆，换言责，根据客户需求决定颜色
 *
 *
 */
public class Test {
    public static void main(String[] args){
        //类的适配器模式
        Vga vga1 = new Typec2Vga1();
        vga1.vgaInterface();
        System.out.println();
        //对象适配器
        Vga vga2 = new Typec2Vga2(new Iphone());
        vga2.vgaInterface();
    }
}
