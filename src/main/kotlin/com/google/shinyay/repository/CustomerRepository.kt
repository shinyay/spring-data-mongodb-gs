package com.google.shinyay.repository

import com.google.shinyay.entity.Customer
import org.springframework.data.mongodb.repository.MongoRepository

interface CustomerRepository : MongoRepository<Customer, String> {
    fun findByFirstName(firstName: String)
}