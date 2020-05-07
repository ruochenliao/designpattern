package StructurePattern.bridgePattern.application.rule;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class AssetDO {
    private String assetCode;
    private String assetType;
    private LocalDate startUsingDate;
    private String brand;
    private String company;
    private String purpose;
}
