package com.north.codechallenge.ankitademo.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Collection {
	
	private String title;
	private String description;
	private String id;
	private Extent extent;
	private String itemType;
	private String[] crs;
	private String storageCrs;
	private List<Link> links;
	private int itemCount;

}
