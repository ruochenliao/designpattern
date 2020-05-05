package createPattern.BuilderPattern.build.view.homepage;

import java.util.List;

public interface PageBuilder {
    List<Operation> buildOperations();
    List<Category> buildCategories();
    List<BriefAsset> buildAssets();
    BriefAsset buildAsset(String assetCode);
    List<News> buildNews();
    ReceiveLocation buildReceiveLocation();
    Homepage buildHomepage();
    AssetDetail buildAssetDetail(String assetCode);
}
