package createPattern.abstractFactory.formAndTask.create;

public interface Factory {
    void createForm(Application application);

    void createTask(TaskDTO taskDTO);
}
