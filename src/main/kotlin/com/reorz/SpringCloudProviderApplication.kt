package com.reorz

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class SpringCloudProviderApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudProviderApplication::class.java, *args)
}
