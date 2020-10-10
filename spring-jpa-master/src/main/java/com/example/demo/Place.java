package com.example.demo;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Place 
{
	public Place() 
	{

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	public Integer getId() 
	{
        	return id;
    	}

	public void setId(Integer id) 
	{
        	this.id = id;
    	}

	private String name;

	public void setName(String name) 
	{
        	this.name = name;
    	}

    	/*** @return the name*/
	public String getName() 
	{
        	return name;
	}

	/*** @param name the name to set*/

	private List<Contact> contacts=new ArrayList<Contact>();
	public List<Contact> getContacts()
	{
		return this.contacts;
	}
	public void setContacts(List<Contact> contacts)
	{
		this.contacts=contacts;
	}

	
}
