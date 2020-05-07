package StructurePattern.bridgePattern.application.rule;

public abstract class ApplicationRuleAbstract {

    AssetRule assetRule;

    public void setAssetRule(AssetRule assetRule) {
        this.assetRule = assetRule;
    }

    abstract Boolean canSubmitApplication(ApplicationDO applicationDO);
}
