package com.dogadoptionapi.service

import com.dogadoptionapi.model.DogAdoption
import com.dogadoptionapi.repository.DogAdoptionRepository
import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service

@Service
class DogAdoptionService(private val repository: DogAdoptionRepository) {

    fun findAllDogs(): Flow<DogAdoption> = repository.findAll()

    suspend fun findDogById(id: String) = repository.findById(id)

    suspend fun saveDog(adoption: DogAdoption) {
        repository.save(adoption)
    }

    suspend fun updateDog(adoption: DogAdoption) {
        repository.save(adoption).takeIf {
            repository.existsById(adoption._id ?: "")
        }
    }

    suspend fun deleteById(id: String) {
        repository.deleteById(id)
    }
}