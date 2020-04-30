package actionPattern.commandPattern;

public class AddAbstractCommand extends AbstractCommand {



    public int execute(int value) {
        this.value = value;
        return calculator.add(value);
    }

    public int reset() {
        return calculator.add(-value);
    }
}
