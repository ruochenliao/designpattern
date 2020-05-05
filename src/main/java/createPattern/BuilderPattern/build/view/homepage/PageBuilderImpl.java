package createPattern.BuilderPattern.build.view.homepage;

import java.util.ArrayList;
import java.util.List;

public class PageBuilderImpl implements PageBuilder {

    @Override
    public Homepage buildHomepage() {
        Homepage homepage = new Homepage();
        homepage.setOperationList(buildOperations());
        homepage.setCategoryList(buildCategories());
        homepage.setBriefAssetList(buildAssets());
        homepage.setNewsList(buildNews());
        homepage.setReceiveLocation(buildReceiveLocation());
        return homepage;
    }

    @Override
    public AssetDetail buildAssetDetail(String assetCode) {
        BriefAsset briefAsset = buildAsset(assetCode);
        AssetUsingInfo assetUsingInfo = buildAssetUsingInfo(assetCode);
        AssetExtension assetExtension = buildAssetExtension(assetCode);
        return combineAssetDetail(briefAsset, assetUsingInfo, assetExtension);

    }

    private AssetExtension buildAssetExtension(String assetCode) {
        return null;
    }

    private AssetDetail combineAssetDetail(BriefAsset briefAsset, AssetUsingInfo assetUsingInfo, AssetExtension assetExtension) {
        AssetDetail assetDetail = new AssetDetail();
        assetDetail.setAssetCode(briefAsset.getAssetCode());
        assetDetail.setAssetName(briefAsset.getAssetName());
        return assetDetail;
    }

    private AssetUsingInfo buildAssetUsingInfo(String assetCode) {
        return null;
    }

    @Override
    public List<Operation> buildOperations() {
        List<Operation> operationList = new ArrayList<>(2);
        Operation operation = new Operation();
        operation.setDisplayName("领用");
        operation.setOperationCode("receive");

        Operation operation1 = new Operation();
        operation1.setDisplayName("归还");
        operation1.setOperationCode("return");

        operationList.add(operation);
        operationList.add(operation1);
        return operationList;
    }

    @Override
    public List<Category> buildCategories() {
        List<Category> categoryList = new ArrayList<>(2);
        Category category = new Category();
        category.setCategoryCode("laptop");
        category.setDisplayName("笔记本");

        Category category1 = new Category();
        category1.setDisplayName("台式机");
        category1.setCategoryCode("desktop");
        categoryList.add(category);
        categoryList.add(category1);

        return categoryList;
    }

    @Override
    public List<BriefAsset> buildAssets() {

        List<String> assetCodes = new ArrayList<>(2);
        assetCodes.add("1");
        assetCodes.add("2");
        List<BriefAsset> briefAssetList = new ArrayList<>(assetCodes.size());
        for(String assetCode:assetCodes){
            BriefAsset briefAsset = buildAsset(assetCode);
            briefAssetList.add(briefAsset);
        }
        return briefAssetList;
    }

    @Override
    public BriefAsset buildAsset(String assetCode){
        BriefAsset briefAsset = new BriefAsset();
        briefAsset.setAssetName("苹果电脑");
        briefAsset.setAssetCode(assetCode);
        briefAsset.setCategoryName("苹果");
        return briefAsset;
    }

    @Override
    public List<News> buildNews() {
        return new ArrayList<>(0);
    }

    @Override
    public ReceiveLocation buildReceiveLocation() {
        ReceiveLocation receiveLocation = new ReceiveLocation();
        receiveLocation.setAddress("阿里巴巴西溪园区");
        List<String> abilityList = new ArrayList<>(2);
        abilityList.add("receive");
        abilityList.add("return");
        receiveLocation.setAbilityList(abilityList);
        return receiveLocation;
    }
}
