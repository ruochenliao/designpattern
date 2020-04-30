package actionPattern.commandPattern;

public abstract class AbstractCommand {
    /**
     * 为了支持撤销操作，使用这个成员变量记录上次传入的数据
     */
    int value;
    /**
     * final 基于我们对单例模式的思想，是一种规范性，美观性
     */
    final static Calculator calculator = new Calculator();


    abstract int execute(int value);
    abstract int reset();
}
