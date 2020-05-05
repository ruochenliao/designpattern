package createPattern.BuilderPattern.build.view.homepage;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class AssetDetail {
    //基本信息
    private String assetCode;
    private String assetName;
    private String categoryName;
    private String categoryCode;
    private List<Action> actionList;
    //使用信息
    private String owner;
    private String startUsingDate;
    //扩展参数
    Map<String, String> extensionMap;
}
