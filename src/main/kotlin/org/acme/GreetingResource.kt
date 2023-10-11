package org.acme

import jakarta.ws.rs.Path
import jakarta.ws.rs.GET
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.POST
import jakarta.ws.rs.PUT
import Greeting

@Path("/hello")
class ReactiveGreetingResource {
    
    @GET
    fun getTodo(todoId: String) {
        println("getTodo: ${todoId}}")
    }

    @GET
    fun getTodos() {
        println("getTodos")
    }

    @POST
    fun createTodo() {
        println("createTodo")
    }

    @PUT
    fun updateTodo(todoId: String) {
        println("updateTodo: ${todoId}}")
    }
}