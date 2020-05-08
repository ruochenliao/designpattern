package StructurePattern.decoratorPattern.asset.property;

public class ModelProperty extends Decorator {

    public ModelProperty(Property property) {
        super(property);
    }

    @Override
    public String getName() {
        return "MBP15" + super.getName();
    }
}
