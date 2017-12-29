package org.app.controller;

import java.util.List;

import org.app.model.Person;
import org.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(value="*")
@RestController
public class HomeCtrl {

	@Autowired
	private PersonService pService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public List<Person> getHome() {
		return pService.getPerson();
	}
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public List<Person> setHome(@RequestBody Person p) {
		return pService.setPerson(p);
}
	
}
