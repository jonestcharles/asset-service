package com.thoughtmechanix.assets.controllers;

import com.thoughtmechanix.assets.model.Asset;
import com.thoughtmechanix.assets.services.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/organizations/{organizationId}/assets")
public class AssetServiceController {

    @Autowired
    private AssetService assetService;

    @GetMapping
    @RequestMapping(value="/{assetId}")
    public Asset getAssets(@PathVariable("organizationId") String organizationId,
                           @PathVariable("assetId") String assetId) {
        return assetService.getAsset(organizationId, assetId);
    }

}
