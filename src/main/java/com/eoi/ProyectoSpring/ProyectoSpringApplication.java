package com.eoi.ProyectoSpring;

import com.eoi.ProyectoSpring.entities.Customer;
import com.eoi.ProyectoSpring.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class ProyectoSpringApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer(
				"Pepe",
				"Lopez",
				"Alegria",
				"@pepe@gmail.com",
				LocalDate.of(1982,5,9),
				LocalDateTime.now()
		);

		Customer customer2 = new Customer(
				"Pepa",
				"Garcia",
				"Lopez",
				"@pepa@gmail.com",
				LocalDate.of(1992,7,25),
				LocalDateTime.now()
		);

		Customer customer3 = new Customer(
				"Jose Luis",
				"Lopez",
				"Garcia",
				"@joseluis@gmail.com",
				LocalDate.of(1988,8,13),
				LocalDateTime.now()
		);

		customerRepository.save(customer);
		customerRepository.save(customer2);
		customerRepository.save(customer3);

	}
}
