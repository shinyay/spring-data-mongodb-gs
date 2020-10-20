package com.google.shinyay.entity

import org.springframework.data.annotation.Id

data class Customer (@Id val id: String? = null,
                     val firstName: String? = null,
                     val lastName: String? = null)