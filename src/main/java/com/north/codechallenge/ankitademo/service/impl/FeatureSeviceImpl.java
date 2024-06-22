package com.north.codechallenge.ankitademo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.north.codechallenge.ankitademo.client.FeaturesClient;
import com.north.codechallenge.ankitademo.model.CollectionData;
import com.north.codechallenge.ankitademo.model.Landing;
import com.north.codechallenge.ankitademo.service.FeatureService;

@Service
public class FeatureSeviceImpl implements FeatureService {
	
	@Autowired
    private FeaturesClient featuresClient;

	@Override
	public Landing getLanding() {
		return featuresClient.getLanding();
	}

	@Override
	public CollectionData getCollections() {
		return featuresClient.getCollections();
	}

}
