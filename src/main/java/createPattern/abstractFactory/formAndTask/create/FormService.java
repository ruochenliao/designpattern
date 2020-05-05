package createPattern.abstractFactory.formAndTask.create;

public interface FormService {
    Boolean check(Application application);
    void createAudit(Application application);
    void saveForm(Application application);
    void createTask(Application application);
}
