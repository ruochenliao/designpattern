package StructurePattern.compositePattern;

public class LOL extends Game{

    public LOL(String name){
        super.setName(name);
    }

    public void display() {
        System.out.println("这个游戏是" + super.getName());

    }
}
