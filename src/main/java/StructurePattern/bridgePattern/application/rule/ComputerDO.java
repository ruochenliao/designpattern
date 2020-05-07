package StructurePattern.bridgePattern.application.rule;

import lombok.Data;

@Data
public class ComputerDO extends AssetDO{
    private String cpu;
    private String mac;
}
