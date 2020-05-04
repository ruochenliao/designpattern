package createPattern.Factory.form.create;

public interface FormFactory {
    Form createForm(String formType);
    Boolean submitForm(Application application);
}
