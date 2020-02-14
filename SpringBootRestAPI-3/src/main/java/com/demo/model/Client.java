package com.demo.model;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Client implements Serializable {
	
	private int clientid;
	private String clientname;
	private String passwordTxt;

}
