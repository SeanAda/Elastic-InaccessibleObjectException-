package com.example.elasticissue.config

import org.elasticsearch.client.RestHighLevelClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.FilterType
import org.springframework.data.elasticsearch.client.ClientConfiguration
import org.springframework.data.elasticsearch.client.RestClients
import org.springframework.data.elasticsearch.core.ElasticsearchOperations
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories


@Configuration
@EnableElasticsearchRepositories(basePackages = ["com.example"])
class ElasticsearchConfig(private val elasticsearchProperties: ElasticsearchProperties) {
    @Bean
    fun client(): RestHighLevelClient {

        val clientConfiguration: ClientConfiguration = ClientConfiguration.builder()
                .connectedTo(elasticsearchProperties.url)
                .withBasicAuth(elasticsearchProperties.username, elasticsearchProperties.password)
                .build()
        return RestClients.create(clientConfiguration)
                .rest()
    }

    @Bean
    fun elasticsearchTemplate(): ElasticsearchOperations {
        return ElasticsearchRestTemplate(client())
    }
}
