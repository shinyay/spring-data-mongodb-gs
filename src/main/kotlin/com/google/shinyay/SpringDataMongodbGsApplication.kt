package com.google.shinyay

import com.google.shinyay.entity.Customer
import com.google.shinyay.repository.CustomerRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class SpringDataMongodbGsApplication(val repository: CustomerRepository) : CommandLineRunner {
	override fun run(vararg args: String?) {
		logger.info("[DELETE ALL]====================")
		repository.deleteAll()
		logger.info("================================")

		logger.info("[SAVE CUSTOMER]=================")
		repository.save(Customer(null,"Alice", "Smith"))
		repository.save(Customer(null,"Bob", "Smith"))
		repository.save(Customer(null,"Carol", "Baker")))
		logger.info("================================")

		logger.info("[FIND CUSTOMERS]================")
		for (customer in repository.findAll()) {
			logger.info(customer.toString())
		}
		logger.info("================================")

		logger.info("[FIND CUSTOMER BY FIRST-NAME]===")
		logger.info(repository.findByFirstName("Alice").toString())
		logger.info("================================")

		logger.info("[FIND CUSTOMERS BY LAST-NAME]===")
		for (customer in repository.findByLastName("Smith")) {
			logger.info(customer.toString())
		}
		logger.info("================================")
	}
}

fun main(args: Array<String>) {
	runApplication<SpringDataMongodbGsApplication>(*args)
}

val Any.logger: Logger
	get() = LoggerFactory.getLogger(this.javaClass)