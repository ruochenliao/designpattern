package StructurePattern.bridgePattern.application.rule;

import java.time.LocalDate;

public class SelfPurchaseRuleImpl extends ApplicationRuleAbstract{
    @Override
    Boolean canSubmitApplication(ApplicationDO applicationDO) {
        String assetCode = applicationDO.getAssetCode();
        if("outsource".equals(applicationDO.getApplicant()) || "internship".equals(applicationDO.getApplicant())){
            return false;
        }

        //mock 数据
        ComputerDO assetDO = new ComputerDO();
        assetDO.setAssetCode(assetCode);
        assetDO.setAssetType("computer");
        assetDO.setCompany("alibaba");
        assetDO.setPurpose("selfUse");
        assetDO.setStartUsingDate(LocalDate.of(1999,9,9));

        if(!assetRule.canOperate(assetDO, applicationDO)){
            return false;
        }

        return true;
    }

    @Override
    String routingBpmsCode(ApplicationDO applicationDO) {
        return null;
    }
}
