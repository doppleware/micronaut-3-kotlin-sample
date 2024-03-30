package com.example

import io.micronaut.context.annotation.Factory
import io.micronaut.context.event.BeanCreatedEvent
import io.micronaut.context.event.BeanCreatedEventListener
import io.micronaut.jdbc.DataSourceResolver
import io.micronaut.runtime.Micronaut.run
import io.opentelemetry.api.OpenTelemetry
import io.opentelemetry.instrumentation.jdbc.datasource.OpenTelemetryDataSource
import jakarta.inject.Singleton

fun main(args: Array<String>) {
	run(*args)
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

