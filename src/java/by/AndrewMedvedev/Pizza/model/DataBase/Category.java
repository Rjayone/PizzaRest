package by.AndrewMedvedev.Pizza.model.DataBase;

import java.util.ArrayList;


public class Category {
    private int id;
    private String title;   
    public ArrayList<Component> components;

    
    public void setId(int id) {
        this.id = id;
    }

   
    public void setTitle(String title) {
        this.title = title;
    }
    
    
    public void setComponents(ArrayList<Component> components) {
        this.components = components;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    
    public void addComponent(Component comp) {
        if(components == null)
            components = new ArrayList<>();
        components.add(comp);
    }
    
}
