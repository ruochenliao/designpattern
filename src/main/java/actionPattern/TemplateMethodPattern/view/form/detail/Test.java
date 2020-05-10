package actionPattern.TemplateMethodPattern.view.form.detail;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        ExchangeFormView exchangeFormView = new ExchangeFormView();
        ReceiveFormView receiveFormView = new ReceiveFormView();
        ReturnFormView returnFormView = new ReturnFormView();

        FormDetailVO exchangeFormDetailVO = new FormDetailVO();
        FormDetailVO receiveFormDetailVO = new FormDetailVO();
        FormDetailVO returnFormDetailVO = new FormDetailVO();

        ApplicationDO applicationDO = new ApplicationDO();
        applicationDO.setApplicant("小明");
        applicationDO.setApplicationType("RECEIVE");
        applicationDO.setAuditId("testAudit");
        applicationDO.setReceiveLocation("receive Location");
        applicationDO.setReturnLocation("return Location");

        exchangeFormView.buildFormDetail(exchangeFormDetailVO, applicationDO);
        System.out.println("更换 form details: " + JSON.toJSONString(exchangeFormDetailVO));
        System.out.println();

        receiveFormView.buildFormDetail(receiveFormDetailVO, applicationDO);
        System.out.println("领用 form details: " + JSON.toJSONString(receiveFormDetailVO));
        System.out.println();

        returnFormView.buildFormDetail(returnFormDetailVO, applicationDO);
        System.out.println("归还 form details: " + JSON.toJSONString(returnFormDetailVO));
    }
}
