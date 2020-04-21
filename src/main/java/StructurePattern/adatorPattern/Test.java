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
        AudiCarFactoryImpl carFactory = new AudiCarFactoryImpl();
        Car car = carFactory.createCar();

        // 问题：客户要求共产对车辆进行喷漆，换言责，根据客户需求决定颜色
        //类适配器
        CarAdaptorImpl carAdaptor = new CarAdaptorImpl();
        Car redCar = carAdaptor.createCar();
        Car blackCar = carAdaptor.changeColor(redCar,"black");
        System.out.println(JSON.toJSONString(blackCar));

        //对象适配器
        CarObjectAdaptor carObjectAdaptor = new CarObjectAdaptor();
        Car audiCar = carObjectAdaptor.createCar("audi");
        Car bmwCar = carObjectAdaptor.createCar("audi");
        carObjectAdaptor.changeColor(audiCar, "black");
        carObjectAdaptor.changeColor(bmwCar, "black");
        System.out.println(JSON.toJSONString(audiCar));
        System.out.println(JSON.toJSONString(bmwCar));
    }
}
