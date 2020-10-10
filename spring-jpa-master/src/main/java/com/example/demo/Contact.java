package com.example.demo;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Contact 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;

    public Contact() {

    }

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
	}

        
    	private String email;
	
	public String getEmail(){

		return this.email;
	}
	public void setEmail(String email){

		this.email=email;
	}
	private List<Place> places=new ArrayList<Place>();

	public void setPlaces(List<Place> places)
	{
		this.places=places;
	}
	public List<Place> getPlaces(List<Place> places)
	{
		return this.places;
	}
		
}
