package com.antonio.wS;

import java.util.List;

import javax.jws.WebService;
import com.antonio.loginDAO.model.Person;

@WebService
public interface RetrievePersonService {
	
	public Person findById(int id);
	public Person findByEmail(String email);
	public List<Person> findAll();

}
