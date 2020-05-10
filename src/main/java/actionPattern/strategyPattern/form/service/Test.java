package actionPattern.strategyPattern.form.service;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, FormService> formServiceMap = new HashMap<>();
        formServiceMap.put("RECEIVE", new ReceiveFormService());
        formServiceMap.put("RETURN", new ReturnFormService());

        FormDO formDO = new FormDO();
        formDO.setId("1");
        formDO.setType("RECEIVE");

        FormService formService = formServiceMap.get(formDO.getType());
        formService.submitForm(formDO);
        formService.finishForm(formDO);
        formService.cancelForm(formDO);
    }
}
