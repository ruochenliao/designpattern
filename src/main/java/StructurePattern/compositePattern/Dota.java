package StructurePattern.compositePattern;

public class Dota extends Game{

    public Dota(String name){
        super.setName(name);
    }

    public void display() {
        System.out.println("这个游戏是" + super.getName());

    }
}
