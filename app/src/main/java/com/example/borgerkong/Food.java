package com.example.borgerkong;


public class Food {
    // unique identifier of an food
    private int foodID;

    // Title of the food
    private String name;
    // Short text to be displayed
    private String description;
    // cost of food
    private Double cost;
    // Resource ID of associated image (e.g. R.drawable.my_image)
    private int imageDrawableId;


    public Food(int foodID, String name, String description, Double cost, int imageDrawableId) {
        this.foodID = foodID;
        this.name = name;
        this.description = description;
        this.cost = cost;

        // Added this line for temporary way of showing images
        this.imageDrawableId = imageDrawableId;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }

}
