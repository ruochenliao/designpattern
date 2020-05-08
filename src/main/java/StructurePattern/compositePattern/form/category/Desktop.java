package StructurePattern.compositePattern.form.category;

public class Desktop extends Asset{
    public Desktop(String name){
        super.setName(name);
    }

    @Override
    void display() {
        System.out.println(super.name);
    }
}
