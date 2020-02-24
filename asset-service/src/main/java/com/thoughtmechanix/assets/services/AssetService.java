package com.thoughtmechanix.assets.services;

import com.thoughtmechanix.assets.model.Asset;
import org.springframework.stereotype.Service;

@Service
public class AssetService {

    public Asset getAsset(String organizationId, String assetId){
        return new Asset()
                .withId(assetId)
                .withOrganizationId(organizationId)
                .withAssetName("Building One")
                .withAssetType("tangible");
    }

    public void saveAsset(Asset asset){

    }

    public void updateAsset(Asset asset){

    }

    public void deleteAsset(Asset asset){

    }
}
