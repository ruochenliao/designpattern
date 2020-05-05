package createPattern.abstractFactory.formAndTask.create;

public class ReturnTask implements Task{

    @Override
    public Boolean check(TaskDTO taskDTO) {
        System.out.println("归还任务通过校验");
        return true;
    }

    @Override
    public void saveTask(TaskDTO taskDTO) {
        System.out.println("保存归还任务");
    }

    @Override
    public void sendMessage(TaskDTO taskDTO) {
        System.out.println("发送归还任务消息");
    }
}
