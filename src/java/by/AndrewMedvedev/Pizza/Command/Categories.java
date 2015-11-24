package by.AndrewMedvedev.Pizza.Command;

import by.AndrewMedvedev.Pizza.controller.Components;
import by.AndrewMedvedev.Pizza.domain.DataBaseQuery;
import by.AndrewMedvedev.Pizza.model.DataBase.Category;
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
import javax.ws.rs.core.MediaType;
import org.codehaus.jackson.map.ObjectMapper;

@Path("categories")
public class Categories {

    @Context
    private UriInfo context;
    
    public Categories() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        DataBaseQuery DBQuery = DataBaseQuery.getInstance();
        ArrayList<Category> categories = new ArrayList<>();
        ArrayList<Component> comps = new ArrayList<>();
        DBQuery.selectAllCategories(categories);
        DBQuery.selectAllComponents(comps);
        
        for(int i = 0; i < categories.size(); i++) {
            Category iCat = categories.get(i);
            for(int j = 0; j < comps.size(); j++) {
                Component jComp = comps.get(j);
                if(jComp.getCategory() == iCat.getId())
                    iCat.addComponent(jComp);
            }
        }
        
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(categories);
        } catch (IOException ex) {
            Logger.getLogger(Components.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;
    }
}
