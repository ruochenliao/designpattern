package StructurePattern.decoratorPattern.asset.property;

public class Test {
    public static void main(String[] args) {
        Property assetProperty = new AssetPropertyImpl();
        ModelProperty modelProperty = new ModelProperty(assetProperty);
        BrandProperty brandProperty = new BrandProperty(modelProperty);
        String name = brandProperty.getName();
        //打印出 苹果MBP15资产属性
        System.out.println(name);
    }
}
