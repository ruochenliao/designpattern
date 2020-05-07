package StructurePattern.bridgePattern.application.rule;

import java.time.LocalDate;

public class ComputerRule implements AssetRule {

    @Override
    public Boolean canOperate(AssetDO assetDO, ApplicationDO applicationDO) {
        ComputerDO computerDO = (ComputerDO) assetDO;
        if (!"alibaba".equals(computerDO.getCompany())) {
            return false;
        }

        if (checkIsInApplication(assetDO.getAssetCode())) {
            return false;
        }

        //自购申请单
        if ("selfPurchase".equals(applicationDO.getApplicationType())) {
            //只能自购自用的资产
            if (!"selfUse".equals(assetDO.getPurpose())) {
                return false;
            }
            //只能自购使用天数大于 42 天的资产
            if(LocalDate.now().toEpochDay() - (assetDO.getStartUsingDate()).toEpochDay() < 42){
                return false;
            }
            return true;
        }

        if ("exchange".equals(applicationDO.getApplicationType())) {
            //公用电脑不允许更换
            if("publicUse".equals(assetDO.getPurpose())){
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public String getBpmsRule(AssetDO assetDO, ApplicationDO applicationDO) {
        if("exchange".equals(applicationDO.getApplicationType())){
            return "123";
        }

        if("selfPurchase".equals(applicationDO.getApplicationType())){
            return "321";
        }

        return null;
    }


    private boolean checkIsInApplication(String assetCode) {
        return false;
    }
}
