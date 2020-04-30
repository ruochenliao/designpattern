package actionPattern.commandPattern;


/**
 * 命令模式
 *
 * 应用
 * 1 需要命令发送者和命令接收者解耦的时候
 * 2 系统需要在不同时间指定请求，将请求排队和执行请求
 * 3 系统支持撤销操作，恢复操作
 * 4 需要把命令打包操作
 *
 * 定义
 * 将请求封装成对象，以便使用不同的请求，日志，队列等来参数化其他对象，命令模式也支持撤销操作。
 *
 * 理论
 * 它将发送命令的责任和执行命令的责任分开，Calculator
 *
 * 优点
 * 降低系统耦合度，接受者和调用者没有直接关系
 *
 *
 */
public class Test {

    public static void main(String[] args) {
        Button invoker = new Button();
        AbstractCommand AddCommand = new AddAbstractCommand();
        invoker.setAbstractCommand(AddCommand);
        invoker.compute(2);
        invoker.compute(3);
        invoker.compute(1);
        invoker.reset();

        AbstractCommand multiplyCommand = new MultiplyAbstractCommand();
        invoker.setAbstractCommand(multiplyCommand);
        invoker.compute(10);
        invoker.reset();
    }

}
