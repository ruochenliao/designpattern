package actionPattern.chainOfResponsibilityPattern.form.createForm.application;

import actionPattern.chainOfResponsibilityPattern.form.createForm.ApplicationDO;
import actionPattern.chainOfResponsibilityPattern.form.createForm.SubmitFormDO;

public interface ApplicationService {
    String getApplicationType();
    Boolean check(SubmitFormDO submitFormDO);
    void saveApplication(ApplicationDO applicationDO);
}
