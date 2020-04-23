package StructurePattern.combinationPattern;

public class CS extends Game{

    public CS(String name){
        super.setName(name);
    }

    public void display() {
        System.out.println("这个游戏是" + super.getName());

    }
}
