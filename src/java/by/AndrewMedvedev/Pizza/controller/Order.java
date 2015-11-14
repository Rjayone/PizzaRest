package by.AndrewMedvedev.Pizza.controller;

import by.AndrewMedvedev.Pizza.Command.Command;
import by.AndrewMedvedev.Pizza.Command.CommandFactory;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;


@Path("order")
public class Order {

    @Context
    private UriInfo context;

    public Order() {
    }

    @GET
    @Produces("application/json")
    public String getJson() {
        //Command command = CommandFactory.receiveHandler(request);

       // if(command != null)
            //page = command.execute(request, response);
        return null;
    }

    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
