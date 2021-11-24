package pe.edu.tecsup.springbootapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.edu.tecsup.springbootapp.beans.Calculadora;

@SpringBootApplication
public class SpringBootAppApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootAppApplication.class, args);
	
	} 

	private static Logger log 
		= LoggerFactory.getLogger(SpringBootAppApplication.class);

	
	private Calculadora calculadora = new Calculadora();

	
	@Override
	public void run(String... args) throws Exception {
		log.info("Hola Mundo con Spring Boot!");

		Double resultado = calculadora.sumar(15.0, 5.0);
		
		log.info("Resultado: " + resultado);

		
	}


}
