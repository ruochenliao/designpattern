package createPattern.Factory.form.create;

public interface Form {
    Boolean check(Application application);
    void createAudit(Application application);
    void saveForm(Application application);
    void createTask(Application application);
}
