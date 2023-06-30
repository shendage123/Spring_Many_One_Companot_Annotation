package Spting_meny_to_one_data30_23.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Spting_meny_to_one_data30_23.dto.Student;

@Component
public class StudentDao {
	
	@Autowired
	private EntityManager entityManager;
	
	
	public void savaStudent(Student student)
	{
		
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.getTransaction().commit();
	}

}
