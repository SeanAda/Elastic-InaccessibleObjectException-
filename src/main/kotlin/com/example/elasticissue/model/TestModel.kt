package com.example.elasticissue.model

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import java.math.BigDecimal

@Document(indexName = "testmodel")
data class TestModel(

    @Id
    val id: String,

    val test: String,

    val testValue: BigDecimal,
)
