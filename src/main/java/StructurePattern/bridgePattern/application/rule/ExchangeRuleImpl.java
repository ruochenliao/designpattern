package StructurePattern.bridgePattern.application.rule;

import java.time.LocalDate;
import java.util.Date;

public class ExchangeRuleImpl extends ApplicationRuleAbstract{
    @Override
    Boolean canSubmitApplication(ApplicationDO applicationDO) {
        if("product".equals(applicationDO.getApplicant())){
            return false;
        }

        //mock 数据
        AssetDO assetDO = new AssetDO();
        assetDO.setAssetCode(applicationDO.getAssetCode());
        assetDO.setAssetType("computer");
        assetDO.setStartUsingDate(LocalDate.now());

        if(!assetRule.canOperate(assetDO, applicationDO)){
            return false;
        }
        return true;
    }
}
