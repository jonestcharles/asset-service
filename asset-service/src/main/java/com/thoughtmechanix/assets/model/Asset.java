package com.thoughtmechanix.assets.model;

public class Asset {
    // TODO: do we need join columns, etc.?
    private String id;
    private String organizationId;
    private String assetName;
    private String assetType;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getAssetType() {
        return assetType;
    }

    public Asset withId(String id){
        this.setId( id );
        return this;
    }

    public Asset withOrganizationId(String organizationId){
        this.setOrganizationId(organizationId);
        return this;
    }

    public Asset withAssetName(String assetName){
        this.setAssetName(assetName);
        return this;
    }

    public Asset withAssetType(String assetType){
        this.setAssetType(assetType);
        return this;
    }
}
