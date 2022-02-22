package com.fitness.app.entity;

import java.util.Date;

import org.bson.types.Binary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImageFile {
	
	 private String id;
	   private String name; // file name
	    private Date createdtime; // upload time
	    private Binary content; // file content
	    private String contenttype; // file type
	    private Long size; // file size
	 
	   
	    
	

}
