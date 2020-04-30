package actionPattern.InterpreterPattern;

/**
 * 解释器模式
 * <p>
 * 应用
 * 解释语言文字，数字等，让计算器，计算机能够理解
 * <p>
 * 定义
 * 所谓解释器模式就是定义"语言的文法"，并建立一个解释器来解释语言中的句子，比如数学，正则表达式
 */
public class Test {
    public static void main(String[] args) {
        String statement = "3 * 2 * 4 / 2 % 5";
        Calculator calculator = new Calculator();
        calculator.build(statement);
        int result = calculator.compute();
        System.out.println(statement + " = " + result);
    }
}
