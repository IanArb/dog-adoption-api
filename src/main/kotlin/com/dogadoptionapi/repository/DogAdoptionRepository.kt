package com.dogadoptionapi.repository

import com.dogadoptionapi.model.DogAdoption
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DogAdoptionRepository : CoroutineCrudRepository<DogAdoption, String>