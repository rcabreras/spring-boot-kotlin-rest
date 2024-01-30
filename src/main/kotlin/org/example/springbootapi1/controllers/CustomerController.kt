package org.example.springbootapi1.controllers

import org.example.springbootapi1.dto.CreateCustomer
import org.example.springbootapi1.dto.Customer
import org.example.springbootapi1.entities.CustomerEntity
import org.example.springbootapi1.services.CustomerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(
    private val customerService: CustomerService,
) {

    @GetMapping("/customers")
    fun getCustomers(): ResponseEntity<List<Customer>> {
        val customersEntities = customerService.getCustomers()
        val customersDTO = customersEntities.map { customerEntity ->
            Customer(
                id = customerEntity.id,
                name = customerEntity.name,
                age = customerEntity.age,
                salary = customerEntity.salary,
            )
        }
        return ResponseEntity.ok(customersDTO)
    }

    @PostMapping("/customer")
    fun createCustomer(@RequestBody createCustomer: CreateCustomer): ResponseEntity<Customer> {
        val customerCreated = customerService.createCustomer(
            CustomerEntity(
                name = createCustomer.name,
                age = createCustomer.age,
                salary = createCustomer.salary,
            )
        )

        return ResponseEntity.ok(Customer(
            id = customerCreated.id,
            name = customerCreated.name,
            age = customerCreated.age,
            salary = customerCreated.salary)
        )
    }

}