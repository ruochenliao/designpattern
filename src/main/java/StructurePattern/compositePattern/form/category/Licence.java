package StructurePattern.compositePattern.form.category;

public class Licence extends Asset{

    public Licence(String name){
        super.setName(name);
    }

    @Override
    void display() {
        System.out.println(super.name);
    }


}
