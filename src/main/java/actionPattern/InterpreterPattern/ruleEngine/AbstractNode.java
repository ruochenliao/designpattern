package actionPattern.InterpreterPattern.ruleEngine;

public abstract class AbstractNode implements Node{
    Node left;
    Node right;

    AbstractNode(Node left, Node right){
        this.left = left;
        this.right = right;
    }

}
