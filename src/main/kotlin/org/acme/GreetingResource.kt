package org.acme

import jakarta.ws.rs.Path
import jakarta.ws.rs.GET
import jakarta.ws.rs.core.MediaType
import Greeting

@Path("/hello")
class ReactiveGreetingResource {
    
    @GET
    fun hello() = Greeting("Hello Quarkus Reactive!")
}