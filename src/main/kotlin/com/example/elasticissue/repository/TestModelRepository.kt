package com.example.elasticissue.repository

import com.example.elasticissue.model.TestModel
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository


interface TestModelRepository : ElasticsearchRepository<TestModel, String> {

}
