package com.example.spelternary

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.expression.ExpressionParser
import org.springframework.expression.spel.standard.SpelExpressionParser

@SpringBootTest
class SpelTernaryApplicationTests {
    @Autowired
    lateinit var bean: SpelTernaryApplication

    @Test
    fun spelEvaluation() {
        val parser: ExpressionParser = SpelExpressionParser()
        val parserResult = parser.parseExpression("true ? 'trueExp' : 'falseExp'").getValue(String::class.java)

        println("parser: $parserResult")
        println("property: ${bean.spel}")
        println("property: ${bean.spel2}")
        println("@Value property: ${bean.spel3}")

        assert("trueExp" == parserResult) { "parser: $parserResult" }
        assert("trueExp" == bean.spel) { "property: ${bean.spel}" }
        assert("a" == bean.spel2) { "property: ${bean.spel2}" }
        assert("trueExp" == bean.spel3) { "@Value property: ${bean.spel3}" }
    }
}
