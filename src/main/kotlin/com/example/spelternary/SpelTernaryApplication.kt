package com.example.spelternary

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.runApplication


@SpringBootApplication
@ConfigurationProperties(prefix = "application")
class SpelTernaryApplication {
    var spel = ""
    var spel2 = ""

    @Value("\${true ? 'trueExp' : 'falseExp'}")
    lateinit var spel3: String
}

fun main(args: Array<String>) {
    runApplication<SpelTernaryApplication>(*args)
}
