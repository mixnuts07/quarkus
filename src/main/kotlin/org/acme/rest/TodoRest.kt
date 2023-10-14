package org.acme.rest

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.inject.Inject
import org.acme.usecase.TodoUsecase

@Path("/todo")
class ReactiveTodoResouce{
    
    private val todoUsecase: TodoUsecase
    
    @GET
    fun getTodo(): String {
        todoUsecase.getTodo()
    }
}