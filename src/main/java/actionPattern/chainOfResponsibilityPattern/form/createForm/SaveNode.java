package actionPattern.chainOfResponsibilityPattern.form.createForm;

import actionPattern.chainOfResponsibilityPattern.form.createForm.application.ApplicationService;
import actionPattern.chainOfResponsibilityPattern.form.createForm.application.ReceiveApplication;
import actionPattern.chainOfResponsibilityPattern.form.createForm.application.ReturnApplication;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class SaveNode implements Node{

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
        ApplicationDO applicationDO = new ApplicationDO();
        applicationDO.setApplicant(submitForm.getApplicant());
        applicationDO.setApplicationCode(submitForm.getApplicationCode());
        applicationDO.setApplicationType(submitForm.getApplicationType());
        System.out.println("保存申请单" + JSON.toJSONString(applicationDO));

        //可扩展点
        applicationServiceMap.get(submitForm.getApplicationType()).saveApplication(applicationDO);
    }
}
