package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRESTController 
{
	@Autowired
	ContactRepository repository;

	@GetMapping("/contacts")
	public Iterable<Contact> getContacts() {
		return repository.findAll();
	}

	@GetMapping("/contacts")
	public void deleteContact(String email) {
		return repository.delete(email);
	}

	@GetMapping("/contacts")
	public void findContactByPLace(String place) {
		
		return repository.findById("id");
	}

}

