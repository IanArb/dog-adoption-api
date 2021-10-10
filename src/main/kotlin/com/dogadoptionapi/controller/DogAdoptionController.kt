package com.dogadoptionapi.controller

import com.dogadoptionapi.model.DogAdoption
import com.dogadoptionapi.service.DogAdoptionService
import kotlinx.coroutines.flow.Flow
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/dogs")
class DogAdoptionController(private val service: DogAdoptionService) {

    @GetMapping
    fun findAllDogs(): Flow<DogAdoption> = service.findAllDogs()

    @GetMapping("{id}")
    suspend fun findDogById(@PathVariable id: String) = service.findDogById(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    suspend fun saveDog(@RequestBody dogAdoption: DogAdoption) = service.saveDog(dogAdoption)

    @PutMapping
    suspend fun updateDog(@RequestBody dogAdoption: DogAdoption) = service.updateDog(dogAdoption)

    @DeleteMapping("/{id}")
    suspend fun deleteById(@PathVariable id: String) = service.deleteById(id)

}