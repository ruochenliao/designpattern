package StructurePattern.bridgePattern;

public class Black implements Color{
    public void paintColor(String carType) {
        System.out.println("black " + carType);
    }
}
