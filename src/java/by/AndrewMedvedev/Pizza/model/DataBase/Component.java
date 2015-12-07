package by.AndrewMedvedev.Pizza.model.DataBase;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Component {
    @JsonProperty("id")             private int id;
    @JsonProperty("name")           private String name;
    @JsonProperty("price")          private int price;
    @JsonProperty("imgPath")        private String imgPath;
    @JsonProperty("layer")          private String layer;
    @JsonProperty("category")       private int category;
    @JsonProperty("categoryTitle")  private String categoryTitle;
    @JsonProperty("mass")           private int mass;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getImgPath() {
        return imgPath;
    }

    public String getLayer() {
        return layer;
    }

    public int getCategory() {
        return category;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }
    
    public int getMass() {
        return mass;
    }

    @JsonCreator
    public void setId(@JsonProperty("id") int id) {
        this.id = id;
    }

    @JsonCreator
    public void setName(@JsonProperty("name") String name) {
        this.name = name;
    }

    @JsonCreator
    public void setPrice(@JsonProperty("price") int price) {
        this.price = price;
    }

    @JsonCreator
    public void setImgPath(@JsonProperty("imgPath") String imgPath) {
        this.imgPath = imgPath;
    }

    @JsonCreator
    public void setLayer(@JsonProperty("layer") String layer) {
        this.layer = layer;
    }

    @JsonCreator
    public void setCategory(@JsonProperty("category") int category) {
        this.category = category;
    }

    @JsonCreator
    public void setCategoryTitle(@JsonProperty("categoryTitle")String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }
    
    @JsonCreator
    public void setMass(@JsonProperty("mass") int mass) {
        this.mass = mass;
    }
}
