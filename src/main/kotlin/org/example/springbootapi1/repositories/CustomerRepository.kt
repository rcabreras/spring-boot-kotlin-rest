package org.example.springbootapi1.repositories

import org.example.springbootapi1.entities.CustomerEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : CrudRepository<CustomerEntity, Long>