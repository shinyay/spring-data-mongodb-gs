package com.google.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDataMongodbGsApplication

fun main(args: Array<String>) {
	runApplication<SpringDataMongodbGsApplication>(*args)
}
