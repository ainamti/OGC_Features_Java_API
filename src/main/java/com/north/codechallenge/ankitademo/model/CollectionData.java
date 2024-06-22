package com.north.codechallenge.ankitademo.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CollectionData {
	
	private String title;
	private String description;
	private List<Collection> collections;
	private List<Link> links;

}
