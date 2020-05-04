package createPattern.simpleFactory.create.form;

import org.apache.commons.lang3.StringUtils;
import sun.security.krb5.internal.APOptions;

public class ReceiveForm implements Form {

    @Override
    public Boolean check(Application application) {
        ReceiveApplication receiveApplication = (ReceiveApplication) application;
        if (receiveApplication == null
                || StringUtils.isBlank(receiveApplication.getApplicant())
                || StringUtils.isBlank(receiveApplication.getFormType())
                || StringUtils.isBlank(receiveApplication.getReason())) {
            return false;
        }
        System.out.println("校验通过");
        return true;
    }

    @Override
    public void createAudit(Application application) {
        System.out.println("创建领用审批单");
    }

    @Override
    public void saveForm(Application application) {
        System.out.println("保存领用申请单");
    }

    @Override
    public void createTask(Application application) {
        System.out.println("创建领用任务");
    }
}
