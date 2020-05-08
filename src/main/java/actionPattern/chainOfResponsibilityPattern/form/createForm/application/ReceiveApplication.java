package actionPattern.chainOfResponsibilityPattern.form.createForm.application;

import actionPattern.chainOfResponsibilityPattern.form.createForm.ApplicationDO;
import actionPattern.chainOfResponsibilityPattern.form.createForm.SubmitFormDO;

public class ReceiveApplication implements ApplicationService{

    @Override
    public String getApplicationType() {
        return "RECEIVE";
    }

    @Override
    public Boolean check(SubmitFormDO submitFormDO) {
        System.out.println("领用申请单 check 完毕");
        return true;
    }

    @Override
    public void saveApplication(ApplicationDO applicationDO) {
        System.out.println("领用申请单保存 完毕");
    }
}
