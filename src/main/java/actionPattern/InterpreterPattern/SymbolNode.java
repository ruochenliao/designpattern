package actionPattern.InterpreterPattern;

/**
 * 非终结 Node，NonTerminalExpression
 */
public abstract class SymbolNode implements Node{

    Node left;
    Node right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}
