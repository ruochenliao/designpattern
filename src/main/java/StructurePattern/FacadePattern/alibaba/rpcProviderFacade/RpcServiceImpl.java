package StructurePattern.FacadePattern.alibaba.rpcProviderFacade;

import StructurePattern.bridgePattern.application.rule.ApplicationDO;
import StructurePattern.bridgePattern.application.rule.AssetDO;

public class RpcServiceImpl implements RpcService{
    @Override
    public void submitForm(ApplicationDO applicationDO) {
        ApplicationService applicationService = new ApplicationService();
        RuleService ruleService = new RuleService();
        UserAssetService userAssetService = new UserAssetService();
        ruleService.checkRule();
        userAssetService.saveAsset(new AssetDO());
        applicationService.saveApplication(new ApplicationDO());

    }
}
