package actionPattern.InterpreterPattern.ruleEngine;

public class AndNode extends AbstractNode{

    public AndNode(Node left, Node right){
        super(left, right);
    }

    @Override
    public Boolean interpret() {
        return left.interpret() && right.interpret();
    }
}
