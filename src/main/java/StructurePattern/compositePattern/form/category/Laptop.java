package StructurePattern.compositePattern.form.category;

public class Laptop extends Asset{
    public Laptop(String name){
        super.setName(name);
    }

    @Override
    void display() {
        System.out.println(super.name);
    }
}
