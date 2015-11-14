/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.AndrewMedvedev.Pizza.controller;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("confirm")
public class Confirm {

    @Context
    private UriInfo context;

    public Confirm() {
    }

//    @GET
//    @Produces("application/json")
//    public String getJson() {
//
//    }
}
