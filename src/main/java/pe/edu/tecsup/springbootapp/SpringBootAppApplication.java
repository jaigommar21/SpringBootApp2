package pe.edu.tecsup.springbootapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.edu.tecsup.springbootapp.beans.Calculadora;
import pe.edu.tecsup.springbootapp.beans.Saludo;
import pe.edu.tecsup.springbootapp.beans.SaludoImpl;

@SpringBootApplication
public class SpringBootAppApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootAppApplication.class, args);
	
	} 

	private static Logger log 
		= LoggerFactory.getLogger(SpringBootAppApplication.class);

	
	//private Calculadora calculadora = new Calculadora();
	
	@Autowired
	private Calculadora calculadora;

	@Qualifier("SaludoInglesImpl")
	@Autowired
	private Saludo saludo;
	
	@Override
	public void run(String... args) throws Exception {
		log.info("Hola Mundo con Spring Boot!");

		Double resultado = calculadora.sumar(15.0, 5.0);
		
		log.info("Resultado: " + resultado);

		log.info(saludo.noche("Jaime"));
		
	}


}
