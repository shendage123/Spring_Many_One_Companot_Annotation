package Spting_meny_to_one_data30_23.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Spting_meny_to_one_data30_23.dao.Configaration;
import Spting_meny_to_one_data30_23.dao.StudentDao;
import Spting_meny_to_one_data30_23.dto.Qspider;
import Spting_meny_to_one_data30_23.dto.Student;

public class Controller {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Configaration.class);
		Qspider qspider=applicationContext.getBean("qspider",Qspider.class);
		qspider.setCource("JavaFullStack-Developer");
		qspider.setAddress("Pune");
		qspider.setFees(40000);
		qspider.setPhone(18000000);
		
		
		Student student1=applicationContext.getBean("student",Student.class);
		student1.setName("Mr_Shubham");
		student1.setBranch("IT");
		student1.setEmail("shubham@gamil.com");
		student1.setAddress("Akurdi");
		student1.setPhone(3827978292l);
		student1.setQspider(qspider);
		
		
		
		Student student2=applicationContext.getBean("student",Student.class);
		student2.setName("Mr_Suarj");
		student2.setBranch("IT");
		student2.setEmail("suraj@gamil.com");
		student2.setAddress("Akurdi");
		student2.setPhone(387978292l);
		student2.setQspider(qspider);
		
		StudentDao dao=applicationContext.getBean("studentDao",StudentDao.class);
		dao.savaStudent(student1);
		dao.savaStudent(student2);
		
	}

}
