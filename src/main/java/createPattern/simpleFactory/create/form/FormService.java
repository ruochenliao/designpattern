package createPattern.simpleFactory.create.form;

public class FormService {
    //注入工厂类
    private static final FormFactory formFactory = new FormFactory();

    public Boolean submitForm(Application application){
        Form form = formFactory.createForm(application.getFormType());
        System.out.println("开始准备提交申请单");
        form.check(application);
        form.createAudit(application);
        form.saveForm(application);
        form.createTask(application);
        System.out.println("提交申请单成功");
        return true;
    }
}
