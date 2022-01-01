package com.example.elasticissue

import com.example.elasticissue.repository.TestModelRepository
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.ComponentScan
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
@ActiveProfiles("test")
class ElasticIssueApplicationTests {

    @Autowired
    lateinit var testModelRepository: TestModelRepository

    @Test
    fun contextLoads() {
    }

    @Test
    fun findAll() {
        testModelRepository.findAll()

        println("Here we go")
    }

}
