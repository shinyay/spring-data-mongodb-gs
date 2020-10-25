package com.google.shinyay

import com.google.shinyay.entity.Customer
import com.google.shinyay.repository.CustomerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class SpringDataMongodbGsApplication(val repository: CustomerRepository) : CommandLineRunner {
	override fun run(vararg args: String?) {
		repository.deleteAll()

		repository.save(Customer(null,"Alice", "Smith"))
		repository.save(Customer(null,"Bob", "Smith"))

		for (customer in repository.findAll()) {
			println(customer)
		}

		println(repository.findByFirstName("Alice"))
	}
}

fun main(args: Array<String>) {
	runApplication<SpringDataMongodbGsApplication>(*args)
}
