package org.example.springbootapi1.services

import org.example.springbootapi1.entities.CustomerEntity
import org.example.springbootapi1.repositories.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService (
    private val customerRepository: CustomerRepository
) {
    fun getCustomers(): List<CustomerEntity> {
        return customerRepository.findAll().toList()
    }

    fun createCustomer(customerEntity: CustomerEntity): CustomerEntity {
        return customerRepository.save(customerEntity)
    }
}