package createPattern.abstractFactory.formAndTask.create;

public interface Task {
    Boolean check(TaskDTO taskDTO);
    void saveTask(TaskDTO taskDTO);
    void sendMessage(TaskDTO taskDTO);
}
