package com.reorz

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class SpringCloudProviderApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudProviderApplication::class.java, *args)
}
