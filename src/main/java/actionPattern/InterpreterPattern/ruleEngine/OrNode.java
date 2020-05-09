package actionPattern.InterpreterPattern.ruleEngine;

public class OrNode extends AbstractNode {
    public OrNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public Boolean interpret() {
        return left.interpret() || right.interpret();
    }
}
