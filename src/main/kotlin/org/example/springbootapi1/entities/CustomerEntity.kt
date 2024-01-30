package org.example.springbootapi1.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal

@Entity
@Table(name = "`CUSTOMERS`")
data class CustomerEntity (
    @Id @GeneratedValue
    val id: Long = -1,
    val name: String? = null,
    val age: Int? = null,
    val salary: BigDecimal? = null,
)