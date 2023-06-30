package Spting_meny_to_one_data30_23.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"Spting_meny_to_one_data30_23.dto","Spting_meny_to_one_data30_23.dao"})
public class Configaration {
	@Bean
public EntityManager getEntityManager()
{
	return Persistence.createEntityManagerFactory("rajath").createEntityManager();
			}
}
