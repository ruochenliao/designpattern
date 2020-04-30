package actionPattern.InterpreterPattern;


public class ModNode extends SymbolNode{

    public ModNode(Node left, Node right) {
        super(left, right);
    }

    public int interpret() {
        return left.interpret() / right.interpret();
    }

}
