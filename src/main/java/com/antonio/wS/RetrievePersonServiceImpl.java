package com.antonio.wS;

import java.util.List;

import javax.jws.WebService;

import com.antonio.loginDAO.dao.PersonDAO;
import com.antonio.loginDAO.daoImpl.PersonDAOImpl;
import com.antonio.loginDAO.model.Person;

@WebService(endpointInterface = "com.antonio.wS.RetrievePersonService")
public class RetrievePersonServiceImpl implements RetrievePersonService{
	
	public Person findById(int id) {
		PersonDAO personDAO = new PersonDAOImpl();
		return personDAO.findById(id);
	}
	
	public Person findByEmail(String email) {
		return new Person();
	}

	public List<Person> findAll(){
		PersonDAO personDAO = new PersonDAOImpl();
		List<Person> persons = personDAO.getAllPersons();
		return persons;
	}
}
