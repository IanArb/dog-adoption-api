package com.dogadoptionapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DogAdoptionApiApplication

fun main(args: Array<String>) {
	runApplication<DogAdoptionApiApplication>(*args)
}
