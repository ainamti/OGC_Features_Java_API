package com.north.codechallenge.ankitademo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.north.codechallenge.ankitademo.config.ClientConfiguration;
import com.north.codechallenge.ankitademo.model.CollectionData;
import com.north.codechallenge.ankitademo.model.Landing;

@FeignClient(value = "landingClient",
url = "${features.api.landing.url}",
configuration = ClientConfiguration.class)
public interface FeaturesClient {

	    @RequestMapping(method = RequestMethod.GET, value = "/")
	    Landing getLanding();
	    
	    @RequestMapping(method = RequestMethod.GET, value = "/collections")
	    CollectionData getCollections(); 


}
