package actionPattern.chainOfResponsibilityPattern.form.createForm;

import actionPattern.chainOfResponsibilityPattern.form.createForm.application.ApplicationService;
import actionPattern.chainOfResponsibilityPattern.form.createForm.application.ReceiveApplication;
import actionPattern.chainOfResponsibilityPattern.form.createForm.application.ReturnApplication;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class CheckNode implements Node{

    Map<String, ApplicationService> applicationServiceMap = new HashMap<>(2);
    void buildMap(){
        applicationServiceMap.put("RECEIVE", new ReceiveApplication());
        applicationServiceMap.put("RETURN", new ReturnApplication());
    }

    @Override
    public Boolean isFilter(ApplicationContext applicationContext) {
        buildMap();
        return true;
    }

    @Override
    public void process(ApplicationContext applicationContext) {
        SubmitFormDO submitForm = applicationContext.getSubmitForm();
        if(StringUtils.isBlank(submitForm.getApplicant())
                || StringUtils.isBlank(submitForm.getApplicationCode())
                || StringUtils.isBlank(submitForm.getApplicationType())){
            throw new RuntimeException("校验不通过");
        }

        //可扩展点
        applicationServiceMap.get(submitForm.getApplicationType()).check(submitForm);
        System.out.println("校验通过");
    }
}
