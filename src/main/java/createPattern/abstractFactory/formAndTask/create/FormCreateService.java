package createPattern.abstractFactory.formAndTask.create;

public class FormCreateService {
    void submitForm(Application application) {
        if ("alibaba".equals(application.getTenant())) {
            AlibabaFormFactory alibabaFormFactory = new AlibabaFormFactory();
            alibabaFormFactory.createForm(application);
        }
        if("tencent".equals(application.getTenant())){
            TencentFormFactory tencentFormFactory = new TencentFormFactory();
            tencentFormFactory.createForm(application);
        }
    }
}
