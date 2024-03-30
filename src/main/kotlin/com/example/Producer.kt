package com.example

import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaClient
interface Producer {
    @Topic("my-products")
    fun sendProduct(@KafkaKey brand: String, name: String)

    fun sendProduct(@Topic topic: String, @KafkaKey brand: String, name: String)
}
