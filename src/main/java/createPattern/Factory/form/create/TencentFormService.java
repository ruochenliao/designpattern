package createPattern.Factory.form.create;

public class TencentFormService implements FormFactory {
    @Override
    public Form createForm(String formType) {
        System.out.println("创建腾讯 " + formType + " 申请单");
        if ("receiveForm".equals(formType)) {
            return new ReceiveForm();
        }
        if ("exchangeForm".equals(formType)) {
            return new ExchangeForm();
        }
        throw new RuntimeException("CAN NOT FIND SUCH FORM TYPE");
    }

    @Override
    public Boolean submitForm(Application application) {
        Form form = createForm(application.getFormType());
        form.check(application);
        form.createAudit(application);
        form.saveForm(application);
        form.createTask(application);
        return true;
    }
}
