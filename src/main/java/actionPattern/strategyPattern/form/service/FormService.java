package actionPattern.strategyPattern.form.service;

public interface FormService {
    String getFormType();
    void submitForm(FormDO formDO);
    void cancelForm(FormDO formDO);
    void finishForm(FormDO formDO);
}
