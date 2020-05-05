package createPattern.BuilderPattern.build.view.homepage;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        ViewService viewService = new ViewService();
        AssetDetail assetDetail = viewService.buildAssetDetails("1");
        Homepage homepage = viewService.buildHomepage();
        System.out.println("======asset Detail=======");
        System.out.println(JSON.toJSONString(assetDetail));
        System.out.println("======asset homepage=========");
        System.out.println(JSON.toJSONString(homepage));
    }
}
