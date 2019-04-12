package com.lmx.springbootmybatis

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object SpringbootmybatisApplication {

    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(SpringbootmybatisApplication::class.java, *args)
    }

}
