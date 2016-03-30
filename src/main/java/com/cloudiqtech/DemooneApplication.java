package com.cloudiqtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cloudiqtech.entity.Person;
import com.cloudiqtech.repo.PersonRepo;


@SpringBootApplication
public class DemooneApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemooneApplication.class, args);
        
      /*  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new         ClassPathResource("spring-config.xml").getPath());
			PersonRepo personRepo = context.getBean(PersonRepo.class);
			Person personAchilles = new Person();
			personAchilles.setpId(1);
			personAchilles.setName("Achilles");
			personRepo.save(personAchilles);
			Person personHektor = new Person();
			personHektor.setpId(2);
			personHektor.setName("Hektor");
			personRepo.save(personHektor);
			
			Iterable<Person> personList = personRepo.findAll();
			System.out.println("Person List : ");
			for (Person person : personList)
            {
		        System.out.println(person);
            }
			
            System.out.println("Person with Id 1 is "+personRepo.fetchByPId(1));
	
        	context.close();

        */
        
        
	}
}
