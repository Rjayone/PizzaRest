package by.AndrewMedvedev.Pizza.controller;

import by.AndrewMedvedev.Pizza.Utils.Utils;
import by.AndrewMedvedev.Pizza.domain.DataBaseQuery;
import by.AndrewMedvedev.Pizza.model.DataBase.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MultivaluedMap;


@Path("order")
public class Order {

    @Context
    private UriInfo context;

    public Order() {
    }

    @POST
    @Produces("application/json")
    public String setOreder(MultivaluedMap<String, String> params) {
        String city    = params.getFirst("city");
        String address = params.getFirst("address");
        String phone   = params.getFirst("phone");
        String price   = params.getFirst("price");
        String comment = params.getFirst("comment");
        String size    = params.getFirst("size");
        String count   = params.getFirst("count");
        String components = params.getFirst("components");
        
        ArrayList<Component> comps = Utils.componentStringToComponentsArray(components);
        DataBaseQuery db = DataBaseQuery.getInstance();
        boolean result = db.sendFullOrder(city, address, phone, comment, comps, size, price, count);
        return "{\"success\" : \""+ result +"\"}";
    }
}
