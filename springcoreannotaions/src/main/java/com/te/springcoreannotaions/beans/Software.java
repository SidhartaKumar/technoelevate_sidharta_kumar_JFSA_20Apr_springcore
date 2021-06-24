package com.te.springcoreannotaions.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Software implements Serializable{
	
	private int androidVersion;
	private String ui;
	
	public Software() {
		
	}
	

}
