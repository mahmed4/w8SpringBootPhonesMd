package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Config;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ConfigRepository;

@SpringBootApplication
public class PhonesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PhonesApplication.class, args);
		
		
//		  ApplicationContext appContext = new
//		  AnnotationConfigApplicationContext(BeanConfiguration.class);
//		  
//		 Config c = appContext.getBean("config", Config.class);
//		  
//		  System.out.println(c.toString());
		 
	}
	
	@Autowired
	ConfigRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		
		//Create a bean to use - not managed by Spring
		Config c = new Config("Apple", "iphone 12 pro",2020, "A14");
		Config d = new Config("Samsung", "Galaxy s10", 2020, "Exynos 9820");
		repo.save(c);
		repo.save(d);
		
		List<Config> allMyContacts = repo.findAll();
		for(Config people: allMyContacts) {
			System.out.println(people.toString());
		}
		
		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
		((AbstractApplicationContext) appContext).close();
	
	}

}
