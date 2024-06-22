package com.north.codechallenge.ankitademo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Link {
	
	private String rel;
	private String type;
	private String title;
	private String href;
}
