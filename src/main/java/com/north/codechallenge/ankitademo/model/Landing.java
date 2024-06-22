package com.north.codechallenge.ankitademo.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Landing {
	
	 
	private String title;
	private String description;
	private String attribution;
	private List<Link> links;
	private Extent extent;
	

}
