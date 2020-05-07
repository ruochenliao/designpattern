package StructurePattern.bridgePattern.application.rule;

public interface AssetRule {
    Boolean canOperate(AssetDO assetDO, ApplicationDO applicationDO);
}
