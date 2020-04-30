package actionPattern.InterpreterPattern;

import java.util.Stack;

/**
 * 解释器的核心
 *
 * 结合了 Context，并且为 Client 提供了统一的调用接口
 */
public class Calculator {
    private Node node;
    private String statement;

    public void build(String statement){
        Node left = null;
        Node right = null;
        Stack stack = new Stack();
    }
}
