package StructurePattern.compositePattern.form.category;

public abstract class Asset {

    public String name;

    public void setName(String name) {
        this.name = name;
    }

    abstract void display();
}
