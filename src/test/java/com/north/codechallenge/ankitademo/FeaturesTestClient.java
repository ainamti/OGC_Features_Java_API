package com.north.codechallenge.ankitademo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.north.codechallenge.ankitademo.config.ClientConfiguration;
import com.north.codechallenge.ankitademo.model.CollectionData;
import com.north.codechallenge.ankitademo.model.Landing;

@FeignClient(value = "landingClient",
url = "${features.api.landing.url}",
configuration = ClientConfiguration.class)
public interface FeaturesTestClient {

	    @RequestMapping(method = RequestMethod.GET, value = "/")
	    String getLanding();
	    
	    @RequestMapping(method = RequestMethod.GET, value = "/collections")
	    String getCollections();

}
