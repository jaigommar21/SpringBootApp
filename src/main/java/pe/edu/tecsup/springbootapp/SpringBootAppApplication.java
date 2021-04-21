package pe.edu.tecsup.springbootapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.edu.tecsup.springbootapp.beans.Calculadora;
import pe.edu.tecsup.springbootapp.beans.Saludo;
import pe.edu.tecsup.springbootapp.beans.SaludoImpl;

@SpringBootApplication
public class SpringBootAppApplication implements CommandLineRunner {

	private static Logger log 
			= LoggerFactory.getLogger(SpringBootAppApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

	@Autowired
	Calculadora calculadora;  // usando  una clase

	@Autowired
	Saludo saludo;			  // usando una interface

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		log.info("Hola Mundo con Spring Boot!");
		
		Double resultado = calculadora.sumar(15.0, 5.0);		
		
		log.info("Resultado: " + resultado);
		
		log.info("Resultado: " + saludo.dia("Jaime"));
		
	}

}
