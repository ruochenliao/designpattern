package createPattern.abstractFactory.formAndTask.create;

public class ReceiveTask implements Task{
    @Override
    public Boolean check(TaskDTO taskDTO) {
        System.out.println("领用任务通过校验");
        return true;
    }

    @Override
    public void saveTask(TaskDTO taskDTO) {
        System.out.println("保存领用任务");
    }

    @Override
    public void sendMessage(TaskDTO taskDTO) {
        System.out.println("发送领用任务消息");
    }
}
