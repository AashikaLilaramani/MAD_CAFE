package com.example.cafe;

import android.os.Parcel;
import android.os.Parcelable;

public class Food implements Parcelable {

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
            new Food("Japchae", 12.99, "stir-fried glass noodles and vegetables", R.drawable.japchae),
            new Food("Kungpao Chicken", 14.50, " spicy, stir-fried Chinese dish", R.drawable.kungpai),
            new Food("Spicy Ramen", 9.99, "noodles with asian chilli sauce", R.drawable.spicyramen),
            new Food("Biriyani", 10.50, "a mixed rice dish with spices", R.drawable.biriyani),
            new Food("Fish Curry and Rice", 11.99, "a light and flavorful curry with rice", R.drawable.fishcurryandrice),
            new Food("Chicken Tikka Masala", 7.50, "roasted marinated chicken with spicy curry", R.drawable.chickentikkamasala),
            new Food("Pho", 10.99, "a soup dish consisting of broth, rice noodles, and meat", R.drawable.pho),
            new Food("Lao Chicken", 15.50, "chicken wings with sticky rice and papaya salad", R.drawable.laochicken),
            new Food("Saik Krok Khmer", 12.99, "well seasoned sausage with southeast asian spices", R.drawable.saikkrokkhmer),

    };

    public static final Food[] dessert = {
            new Food("Mochi", 3.99, "4 pancakes", R.drawable.mochi),
            new Food("Melonpan", 4.50, "Crispy Golden Brown", R.drawable.melonpan),
            new Food("Mooncake", 2.99, "4 pancakes", R.drawable.mooncake),
            new Food("Gulab Jamun", 2.50, "Crispy Golden Brown", R.drawable.gulabjamun),
            new Food("Kulfi", 3.99, "4 pancakes", R.drawable.kulfi),
            new Food("Ras Malai", 5.50, "Crispy Golden Brown", R.drawable.rasmalai),
            new Food("Banh Bo", 3.99, "4 pancakes", R.drawable.banhbo),
            new Food("Buko pie", 10.50, "Crispy Golden Brown", R.drawable.bukopie),
            new Food("Halo-halo", 7.50, "Crispy Golden Brown", R.drawable.halohalo),
    };

    public static final Food[] drinks = {
            new Food("Sake", 7.99, "4 pancakes", R.drawable.sake),
            new Food("Yuan Yang Tea", 3.50, "Crispy Golden Brown", R.drawable.yuanyang),
            new Food("Soju", 8.50, "Crispy Golden Brown", R.drawable.soju),
            new Food("Chai", 2.50, "Crispy Golden Brown", R.drawable.chai),
            new Food("Lassi", 2.50, "Crispy Golden Brown", R.drawable.lassi),
            new Food("Rooh Afza Sharbat", 3.50, "Crispy Golden Brown", R.drawable.roohafza),
            new Food("Nuoc Mia", 5.50, "Crispy Golden Brown", R.drawable.nuocmia),
            new Food("Bubble Tea (Boba Tea)", 6.50, "Crispy Golden Brown", R.drawable.bobatea),
            new Food("Teh Tarik", 4.50, "Crispy Golden Brown", R.drawable.tehtarik),
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
    //this code is the same for any class that implements Parcelable
    //all that changes is the class name (ex: Food)
    public static final Parcelable.Creator<Food> CREATOR = new
            Parcelable.Creator<Food>() {

                @Override
                public Food createFromParcel(Parcel parcel) {
                    return new Food(parcel);
                }

                @Override
                public Food[] newArray(int size) {
                    return new Food[0];
                }
            };

    /* This is a "constructor" of sorts that is needed with the Parceable interface to
     * tell the intent how to create a Food object when it is received from the intent
     * basically it is setting each instance variable as a String or Int
     * if the instance variables were objects themselves you would need to do more complex * code.  We need to read in the String, double, and int data.
     *
     * @param parcel    the parcel that is received from the intent
     */

    public Food(Parcel parcel) {
        name = parcel.readString();
        price = parcel.readDouble();
        desc = parcel.readString();
        imageResourceID = parcel.readInt();
    }

    @Override
    /*
    * This is what is used when we send the Food object through an intent
    * It is also a method that is part of the Parceable interface and is needed
    * to set up the object that is being sent.  Then, when it is received, the
    * other Food constructor that accepts a Parcel reference can "unpack it"
    *
    */
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeDouble(price);
        dest.writeString(desc);
        dest.writeInt(imageResourceID);
    }

    public Food() {
        name = "";
        price = 0;
        desc = "";
        imageResourceID = 0;
    }

    public String toString() {
        return this.name;
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
    /*
     * This method is required for the Parceable interface.  As of now, this method * is in the default state and doesn't really do anything.
     *
     * If your Parcelable class will have child classes, you'll need to
     * take some extra care with the describeContents() method. This would
     * let you identify the specific child class that should be created by
     * the Parcelable.Creator. You can read more about how this works on
     *  Stack Overflow with this link.
     *           https://stackoverflow.com/questions/4778834/purpose-of-describecontents-of-parcelable-interface
     * @return
     */

    @Override
    public int describeContents() {
        return 0;
    }



}
