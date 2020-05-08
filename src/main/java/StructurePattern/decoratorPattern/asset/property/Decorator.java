package StructurePattern.decoratorPattern.asset.property;

public abstract class Decorator implements Property {
    Property property;

    public Decorator(Property property){
        this.property = property;
    }

    @Override
    public String getName() {
        return property.getName();
    }
}
