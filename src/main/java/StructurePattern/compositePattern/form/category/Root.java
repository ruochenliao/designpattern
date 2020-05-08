package StructurePattern.compositePattern.form.category;

import java.util.ArrayList;
import java.util.List;

public class Root extends Asset {
    List<Asset> assets;

    public Root(String name) {
        super.setName(name);
        assets = new ArrayList<>();
    }

    @Override
    void display() {
        for (Asset asset : assets) {
            asset.display();
        }
    }

    void addAsset(Asset asset) {
        assets.add(asset);
    }

    void showLowerLevel() {
        for (Asset asset : assets) {
            System.out.println(asset.name);
        }
    }
}
