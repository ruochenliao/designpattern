package createPattern.BuilderPattern.build.view.homepage;

import lombok.Data;
import java.util.List;

@Data
public class BriefAsset {
    private String assetCode;
    private String assetName;
    private String categoryName;
    private String categoryCode;
    private List<Action> actionList;
}
