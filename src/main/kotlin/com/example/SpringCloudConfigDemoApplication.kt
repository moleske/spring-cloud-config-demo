package com.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class SpringCloudConfigDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudConfigDemoApplication::class.java, *args)
}
