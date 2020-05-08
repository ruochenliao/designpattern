package actionPattern.chainOfResponsibilityPattern.form.createForm.application;


import actionPattern.chainOfResponsibilityPattern.form.createForm.ApplicationDO;
import actionPattern.chainOfResponsibilityPattern.form.createForm.SubmitFormDO;

public class ReturnApplication implements ApplicationService {

    @Override
    public String getApplicationType() {
        return "RETURN";
    }

    @Override
    public Boolean check(SubmitFormDO submitFormDO) {
        System.out.println("归还申请单校验通过");
        return true;
    }

    @Override
    public void saveApplication(ApplicationDO applicationDO) {
        System.out.println("归还申请保存完毕");
    }
}
