package StructurePattern.compositePattern.form.category;

import java.util.ArrayList;
import java.util.List;

public class SoftAsset extends Asset{

    List<Asset> assets;

    public SoftAsset(String name){
        setName(name);
        assets = new ArrayList<>(0);
    }

    @Override
    void display() {
        for(Asset asset:assets){
            asset.display();
        }
    }

    void addAsset(Asset asset){
        assets.add(asset);
    }
}
