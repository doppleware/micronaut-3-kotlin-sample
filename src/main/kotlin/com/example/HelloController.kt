package com.example

import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.Topic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.annotation.ExecuteOn
import io.micronaut.tracing.annotation.NewSpan

@ExecuteOn(TaskExecutors.IO) // <1>  // <1>
@Controller("/hello")
open class HelloController {

    @Get("/")
    fun hello(): String {
        return hi();
    }

    @NewSpan
    open fun hi():String{
        return FinalClass().test();
    }
}

