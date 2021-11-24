package pe.edu.tecsup.springbootapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp2Application implements CommandLineRunner  {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootApp2Application.class, args);
	
	}

	private static Logger log 
		= LoggerFactory.getLogger(SpringBootApp2Application.class);
	
	@Override
	public void run(String... args) throws Exception {
		log.info("Hola Mundo con Spring Boot!");
		System.out.println("Hola Mundo con Spring Boot!");
	}


}
