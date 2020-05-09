package actionPattern.InterpreterPattern.ruleEngine;

public class ValueNode implements Node{

    Boolean value;

    public ValueNode(Boolean value) {
        this.value = value;
    }

    @Override
    public Boolean interpret() {
        return value;
    }
}
