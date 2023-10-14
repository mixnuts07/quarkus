package org.acme.rest

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path

@Path("/todo")
class ReactiveTodoResouce{   
    
    @GET
    fun getTodo() {
        print("getTodo")
    }
}