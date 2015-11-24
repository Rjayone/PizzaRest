package by.AndrewMedvedev.Pizza.controller;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("mobile")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(by.AndrewMedvedev.Pizza.Command.Categories.class);
        resources.add(by.AndrewMedvedev.Pizza.controller.Components.class);
        resources.add(by.AndrewMedvedev.Pizza.controller.Confirm.class);
        resources.add(by.AndrewMedvedev.Pizza.controller.Order.class);
    }
    
}
