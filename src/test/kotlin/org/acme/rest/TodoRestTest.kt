package org.acme.rest

import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test
import io.restassured.RestAssured.given

@QuarkusTest
class TodoRestTest {

    @Test
    fun getTodo() {
        given()
            .`when`()
    }
}