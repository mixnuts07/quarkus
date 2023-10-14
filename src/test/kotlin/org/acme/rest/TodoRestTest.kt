package org.acme.rest

import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.equalTo

@QuarkusTest
class TodoRestTest {

    @Test
    fun testGetTodoEndpoint() {
        given()
            .`when`().get("/todo")
            .then()
                .statusCode(200)
                .body("message", equalTo("get todo"))
    }
}