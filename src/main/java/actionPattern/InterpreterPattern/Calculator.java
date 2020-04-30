package actionPattern.InterpreterPattern;

import java.util.Stack;

/**
 * 解释器的核心
 * <p>
 * 结合了 Context，并且为 Client 提供了统一的调用接口
 */
public class Calculator {
    private Node node;
    private String statement;

    public void build(String statement) {
        Node left;
        Node right;
        //提供环境，存储关系
        Node temp = null;
        String[] statementArr = statement.split(" ");
        for (int i = 0; i < statementArr.length; i++) {
            if ("*".equals(statementArr[i])) {
                left = temp;
                int val = Integer.valueOf(statementArr[++i]);
                right = new ValueNode(val);
                temp = new MulNode(left, right);
            } else if ("/".equals(statementArr[i])) {
                left = temp;
                int val = Integer.valueOf(statementArr[++i]);
                right = new ValueNode(val);
                temp = new DivNode(left, right);
            } else if ("%".equals(statementArr[i])) {
                left = temp;
                int val = Integer.valueOf(statementArr[++i]);
                right = new ValueNode(val);
                temp = new ModNode(left, right);
            } else {
                int val = Integer.parseInt(statementArr[i]);
                temp = new ValueNode(val);
            }
        }
        node = temp;
    }

    public int compute(){
        return node.interpret();
    }
}
