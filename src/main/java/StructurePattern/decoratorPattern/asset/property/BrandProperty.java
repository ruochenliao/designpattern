package StructurePattern.decoratorPattern.asset.property;

public class BrandProperty extends Decorator {


    public BrandProperty(Property property) {
        super(property);
    }

    @Override
    public String getName() {
        return "苹果" + super.getName();
    }
}
