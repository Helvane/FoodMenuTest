package org.app.service;

import java.util.ArrayList;
import java.util.List;

import org.app.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	private List<Person> ListPerson;
	
	PersonService(){
		ListPerson = new ArrayList<Person>();
	}
	
	public List<Person> setPerson(Person p) {
		ListPerson.add(p);
		return ListPerson;
	}
	
	public List<Person> getPerson() {
		return ListPerson;
	}
}
