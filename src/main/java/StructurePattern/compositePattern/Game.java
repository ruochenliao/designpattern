package StructurePattern.compositePattern;

import lombok.Data;

@Data
public abstract class Game {

    String name;

    public abstract void display();
}
