package createPattern.BuilderPattern.build.view.homepage;

public class ViewService {
    public Homepage buildHomepage(){
        PageBuilder pageBuilder = new PageBuilderImpl();
        return pageBuilder.buildHomepage();
    }

    public AssetDetail buildAssetDetails(String assetCode){
        PageBuilder pageBuilder = new PageBuilderImpl();
        return pageBuilder.buildAssetDetail(assetCode);
    }
}
