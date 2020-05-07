package StructurePattern.bridgePattern.application.rule;

import createPattern.abstractFactory.formAndTask.create.Application;

public class Test {
    public static void main(String[] args) {
        SelfPurchaseRuleImpl selfPurchaseRule = new SelfPurchaseRuleImpl();
        ApplicationDO applicationDO = new ApplicationDO();
        applicationDO.setApplicant("regular");
        applicationDO.setApplicationType("selfPurchase");
        selfPurchaseRule.setAssetRule(new ComputerRule());
        Boolean canSubmitApplication = selfPurchaseRule.canSubmitApplication(applicationDO);
        System.out.println("提交成功:" + canSubmitApplication);
    }
}
