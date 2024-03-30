package com.example

import io.micronaut.context.ApplicationContext
import io.micronaut.context.event.ApplicationEventListener
import io.micronaut.context.event.StartupEvent
import io.micronaut.runtime.Micronaut.run
import jakarta.inject.Singleton


fun main(args: Array<String>) {
	val context=run(*args)
	val client: Producer = context.getBean(Producer::class.java)
	client.sendProduct("Nike", "Blue Trainers")
}


@Singleton
fun produceStuff(context: ApplicationContext){
	val client: Producer = context.getBean(Producer::class.java)
	client.sendProduct("Nike", "Blue Trainers")
}

//@Factory
//class Beans {
//
//	@Singleton
//	fun otel(telemetry: OpenTelemetry?, resolver: DataSourceResolver): BeanCreatedEventListener<DataSource?> {
//		return BeanCreatedEventListener<DataSource?> { event: BeanCreatedEvent<DataSource?> ->
//			val dataSource = event.bean
//			OpenTelemetryDataSource(
//				resolver.resolve(dataSource, telemetry)
//			)
//		}
//	}
//}

