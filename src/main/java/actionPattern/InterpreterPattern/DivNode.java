package actionPattern.InterpreterPattern;

public class DivNode extends SymbolNode{

    public DivNode(Node left, Node right) {
        super(left, right);
    }

    public int interpret() {
        return left.interpret() / right.interpret();
    }
}
