package org.example.springbootapi1.dto

import java.math.BigDecimal

data class Customer(
    val id: Long,
    val name: String?,
    val age: Int?,
    val salary: BigDecimal?,
)