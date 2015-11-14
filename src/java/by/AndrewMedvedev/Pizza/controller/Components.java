package by.AndrewMedvedev.Pizza.controller;

import by.AndrewMedvedev.Pizza.domain.DataBaseQuery;
import by.AndrewMedvedev.Pizza.model.DataBase.Component;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.codehaus.jackson.map.ObjectMapper;


@Path("components")
public class Components {

    @Context
    private UriInfo context;

    public Components() {
    }

    @GET
    @Produces("application/json")
    public String getJson() {
        DataBaseQuery DBQuery = DataBaseQuery.getInstance();
        ArrayList<Component> comps = new ArrayList<>();
        DBQuery.selectAllComponents(comps);
        
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(comps);
        } catch (IOException ex) {
            Logger.getLogger(Components.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;
    }
}
