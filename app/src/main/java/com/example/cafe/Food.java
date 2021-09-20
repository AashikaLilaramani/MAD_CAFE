package com.example.cafe;

public class Food {

    /*
    These final static arrays will represent the data for each category. If you have three categories,
    you will have three separate arrays. Each array can have as many elements as it wants. Each element in
    the category array will contain the data for that specific Food item within that category.

    As a placeholder, if you don't have your images yet, use 0. Ex. R.drawable.pizza OR 0

    static means this variable doesn't belong to any one Food item, but rather, it is a class variable
    and it belongs to the Food class as a whole.

    Because the array is public, we can access it from other Activity files by using className.arrayName
    Ex:
    MainActivity.myBreakfast

    An initializer list allows us to create AND fill an array in one line of code. Ex:
    int[] myNumbers = {2,4,6,8};
    String[] myNames = {"Bob","Jim","Kim"};
    In the Food[] we need to make sure we call the Food constructor for each of the objects we wish
    to include in this initializer list.
     */

    public static final Food[] mainCourse = {
            new Food("Japchae", 12.99, "4 pancakes", R.drawable.japchae),
            new Food("Kungpao Chicken", 14.50, "Crispy Golden Brown", R.drawable.kungpai),
            new Food("Spicy Ramen", 9.99, "4 pancakes", R.drawable.spicyramen),
            new Food("Biriyani", 10.50, "Crispy Golden Brown", R.drawable.biriyani),
            new Food("Fish Curry and Rice", 11.99, "4 pancakes", R.drawable.fishcurryandrice),
            new Food("Chicken Tikka Masala", 7.50, "Crispy Golden Brown", R.drawable.chickentikkamasala),
            new Food("Pho", 10.99, "4 pancakes", R.drawable.pho),
            new Food("Lao Chicken", 15.50, "Crispy Golden Brown", R.drawable.laochicken),
            new Food("Saik Krok Khmer", 12.99, "4 pancakes", R.drawable.saikkrokkhmer),

    };

    public static final Food[] dessert = {
            new Food("Mochi", 3.99, "4 pancakes", 0),
            new Food("Melonpan", 4.50, "Crispy Golden Brown", 0),
            new Food("Mooncake", 2.99, "4 pancakes", 0),
            new Food("Gulab Jamun", 2.50, "Crispy Golden Brown", 0),
            new Food("Kulfi", 3.99, "4 pancakes", 0),
            new Food("Ras Malai", 5.50, "Crispy Golden Brown", 0),
            new Food("Banh Bo", 3.99, "4 pancakes", 0),
            new Food("Buko pie", 10.50, "Crispy Golden Brown", 0),
            new Food("Halo-halo", 7.50, "Crispy Golden Brown", 0),
    };

    public static final Food[] drinks = {
            new Food("Sake", 7.99, "4 pancakes", 0),
            new Food("Yuan Yang Tea", 3.50, "Crispy Golden Brown", 0),
            new Food("Soju", 8.50, "Crispy Golden Brown", 0),
            new Food("Chai", 2.50, "Crispy Golden Brown", 0),
            new Food("Lassi", 2.50, "Crispy Golden Brown", 0),
            new Food("Rooh Afza Sharbat", 3.50, "Crispy Golden Brown", 0),
            new Food("Nuoc Mia", 5.50, "Crispy Golden Brown", 0),
            new Food("Bubble Tea (Boba Tea)", 6.50, "Crispy Golden Brown", 0),
            new Food("Teh Tarik", 4.50, "Crispy Golden Brown", 0),
    };


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
    }

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
