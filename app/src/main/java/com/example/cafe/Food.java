package com.example.cafe;

public class Food {

    private String name;
    private double price;
    private String desc;
    private int imageResourceID;

    /*
    to autogenerate code like constructors and get/set methods, go on the top Menu to Code
    - Generate and select what you want :)
     */

    public Food(String name, double price, String desc, int imageResourceID) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.imageResourceID = imageResourceID;
    }

    public Food(String name, double price, int imageResourceID) {
        this.name = name;
        this.price = price;
        this.imageResourceID = imageResourceID;
        //if no desc is provided, we set it to be empty
        this.desc="";
    }`

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }


}
