package createPattern.Factory.form.create;

public class AlibabaFormFactory implements FormFactory {

    @Override
    public Form createForm(String formType) {
        System.out.println("创建阿里巴巴 "+ formType + " 申请单");
        if ("receiveForm".equals(formType)) {
            return new ReceiveForm();
        }
        if("exchangeForm".equals(formType)){
            return new ExchangeForm();
        }
        throw new RuntimeException("CAN NOT FIND SUCH FORM TYPE");
    }

    @Override
    public Boolean submitForm(Application application) {
        System.out.println("Alibaba form 开始提交");
        Form form = createForm(application.getFormType());
        form.check(application);
        form.createAudit(application);
        form.saveForm(application);
        form.createTask(application);
        System.out.println("Alibaba form 提交完成");
        return true;
    }
}
