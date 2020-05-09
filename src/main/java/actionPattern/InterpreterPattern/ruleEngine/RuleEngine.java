package actionPattern.InterpreterPattern.ruleEngine;

public class RuleEngine {

    Node node;

    public void build(String statement) {
        String[] operations = statement.split(" ");
        Node left;
        Node right;
        Node temp = null;
        for (int i = 0; i < operations.length; i++) {
            if ("and".equalsIgnoreCase(operations[i])) {
                left = temp;
                right = new ValueNode(Boolean.valueOf(operations[i + 1]));
                AndNode andNode = new AndNode(left, right);
                temp = new ValueNode(andNode.interpret());
            } else if ("or".equalsIgnoreCase(operations[i])) {
                left = temp;
                right = new ValueNode(Boolean.valueOf(operations[i + 1]));
                OrNode orNode = new OrNode(left, right);
                temp = new ValueNode(orNode.interpret());
            } else {
                temp = new ValueNode(Boolean.valueOf(operations[i]));
            }
        }
        node = temp;
    }

    Boolean compute(){
        return node.interpret();
    }
}
