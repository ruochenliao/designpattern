package actionPattern.commandPattern;

public class MultiplyAbstractCommand extends AbstractCommand {

    /**
     * 为了支持撤销操作，使用这个成员变量记录上次传入的数据
     */
    public int execute(int value) {
        this.value = value;
        return calculator.multiply(value);
    }

    public int reset() {
        return calculator.multiply(1)/value;
    }
}
