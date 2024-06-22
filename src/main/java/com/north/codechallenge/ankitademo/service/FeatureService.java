package com.north.codechallenge.ankitademo.service;

import com.north.codechallenge.ankitademo.model.CollectionData;
import com.north.codechallenge.ankitademo.model.Landing;

public interface FeatureService {
	
	Landing getLanding();
	
	CollectionData getCollections();

}
