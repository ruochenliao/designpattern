package createPattern.simpleFactory.create.form;

public interface Form {
    Boolean check(Application application);
    void createAudit(Application application);
    void saveForm(Application application);
    void createTask(Application application);
}
