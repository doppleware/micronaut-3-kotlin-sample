package com.example

import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.OffsetReset
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaListener(offsetReset = OffsetReset.EARLIEST)
class Consumer {

    @Topic("my-products")
    fun receive(@KafkaKey brand: String,  name:String) {
        System.out.println("Got Product - " + name + " by " + brand);
    }
}