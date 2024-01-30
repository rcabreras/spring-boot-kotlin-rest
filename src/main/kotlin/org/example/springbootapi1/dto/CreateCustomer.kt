package org.example.springbootapi1.dto

import java.math.BigDecimal

data class CreateCustomer(val name: String, val age: Int, val salary: BigDecimal)