package StructurePattern.compositePattern.form.category;


public class Test {
    public static void main(String[] args) {
        Root root = new Root("root");
        ItAsset itAsset = new ItAsset("itAsset");
        Laptop laptop = new Laptop("laptop");
        Desktop desktop = new Desktop("desktop");
        SoftAsset softAsset = new SoftAsset("software");
        Licence licence = new Licence("licence");

        root.addAsset(softAsset);
        softAsset.addAsset(licence);
        root.addAsset(itAsset);
        itAsset.addAsset(laptop);
        itAsset.addAsset(desktop);

        System.out.println("所有叶子节点");
        root.display();

        System.out.println("软件资产的叶子节点");
        softAsset.display();

        System.out.println("it 资产的叶子节点");
        itAsset.display();

        //只显示 root 下一级
        root.showLowerLevel();
    }
}
