package com.north.codechallenge.ankitademo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.json.JSONException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.gson.Gson;
import com.north.codechallenge.ankitademo.model.CollectionData;
import com.north.codechallenge.ankitademo.model.Landing;
import com.north.codechallenge.ankitademo.service.FeatureService;


@SpringBootTest
public class FeatureServiceTests {
	
	    @Autowired
	    private FeatureService featureService;
	    
	    @Autowired
	    private FeaturesTestClient featuresTestClient;
	    
	    private static Gson gson = new Gson();

	    @Test
	    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
	    }

	    @Test
	    public void whenGetLanding_thenLandingObjectIsNonNull() throws JSONException {

	        Landing landing = featureService.getLanding();
	        String landingJson = gson.toJson(landing);
	        String expected = featuresTestClient.getLanding();	        
	        JSONAssert.assertEquals(expected, landingJson, false);
	    }
	    
	    @Test
	    public void whenGetCollections_thenCollectionIsNonNull() throws JSONException {

	        CollectionData collectionData = featureService.getCollections();
	        String collectionDataJson = gson.toJson(collectionData);
	        String expected = featuresTestClient.getCollections();
	        JSONAssert.assertEquals(expected, collectionDataJson, false);
	    }
}
