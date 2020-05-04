package StructurePattern.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 相当于工厂类 FlyweightFactory，提供了享元池工厂，用于维护享元池（静态存储空间）
 */
public class CapFactory {
    /**
     * 享元池
     */
    private static Map<String, BottleCap> map = new HashMap<>();

    /**
     * @param color
     * @param bottleCap
     * @return
     */
    public static BottleCap getBottleCap(String color, BottleCap bottleCap){
        if(map.get(color) != null){
            return map.get(color);
        }

        BottleCap cap = new SharedCap(color, bottleCap);
        map.put(color, bottleCap);
        return cap;
    }
}
