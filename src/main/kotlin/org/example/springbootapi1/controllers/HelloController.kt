package org.example.springbootapi1.controllers

import org.example.springbootapi1.dto.HelloUser
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello")
    fun helloGet(): String {
        return "Hello, World - Get!"
    }

    @PostMapping("/hello")
    fun helloPost(): String {
        return "Hello, World Post!"
    }

    @PostMapping("/hello-with-body")
    fun helloWithBody(@RequestBody helloUser: HelloUser?): String {
        return "Hello, World Post with body! ${helloUser?.name} ${helloUser?.age ?: "No age"}"
    }
}