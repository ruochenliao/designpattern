package createPattern.BuilderPattern.build.view.homepage;

import lombok.Data;
import java.util.List;

@Data
public class Homepage {
    List<Operation> operationList;
    List<Category> categoryList;
    List<BriefAsset> briefAssetList;
    List<News> newsList;
    ReceiveLocation receiveLocation;
}
