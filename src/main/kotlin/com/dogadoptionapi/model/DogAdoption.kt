package com.dogadoptionapi.model

import org.bson.codecs.pojo.annotations.BsonId
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "dogs")
data class DogAdoption(
    @BsonId
    val _id: String? = null,
    val name: String,
    val breed: String,
    val gender: String,
    val age: Int,
    val suitability: String,
    val requiresTraining: Boolean,
    val image: String
)