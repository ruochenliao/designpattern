package StructurePattern.bridgePattern.application.rule;


public class MonitorRule implements AssetRule{
    @Override
    public Boolean canOperate(AssetDO assetDO, ApplicationDO applicationDO) {

        if (checkIsInApplication(assetDO.getAssetCode())) {
            return false;
        }

        //自购申请单
        if ("selfPurchase".equals(applicationDO.getApplicationType())) {
            //显示器不能自购
            return false;
        }

        if ("exchange".equals(applicationDO.getApplicationType())) {
            //公用显示器不允许更换
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
