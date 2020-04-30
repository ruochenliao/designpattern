package actionPattern.commandPattern;

/**
 *
 * Receiver
 *
 * 计算器，对命令进行执行
 */
public class Calculator {

    private int num = 0;

    public int add(int value){
        num += value;
        return num;
    }

    public int multiply(int value){
        num *= value;
        return num;
    }
}
