package com.north.codechallenge.ankitademo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class Spatial {
	
	private String crs;
	private BigDecimal[][] bbox;
	
}
