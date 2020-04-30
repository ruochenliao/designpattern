package actionPattern.commandPattern;

/**
 * 代表 Invoker 调用者，是发送命令的角色
 *
 */
public class Button {
    AbstractCommand abstractCommand;

    public void setAbstractCommand(AbstractCommand abstractCommand) {
        this.abstractCommand = abstractCommand;
    }

    public void compute(int value){
        int i = abstractCommand.execute(value);
        System.out.println("计算成功，结果为: " + i);
    }

    public void reset(){
        int i = abstractCommand.reset();
        System.out.println("撤销成功，结果为：" + i);
    }
}
