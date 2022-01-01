package com.example.elasticissue.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated

@Component
@ConfigurationProperties("elasticsearch")
@Validated
class ElasticsearchProperties {

    lateinit var url: String

    var username: String = ""
    var password: String = ""
}
