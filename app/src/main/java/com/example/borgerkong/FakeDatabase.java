package com.example.borgerkong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeDatabase {

    /***
     * Retrieves an Food object using the provided id.
     */
    public static Food getFoodById(int foodID) {
        return food.get(foodID);
    }

    /***
     * Return an ArrayList containing all the food in the database.
     */
    public static ArrayList<Food> getAllFood() {
        return new ArrayList<Food>((List) Arrays.asList(food.values().toArray()));
    }

    private static final HashMap<Integer, Food> food = new HashMap<>();

    static {
        food.put(1, new Food(
                1,
                "Impossible Whooper",
                "Our Impossible Whooper Sandwich features a savory flame-grilled patty made from plants topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun. \n" +
                        "100% Whooper, 0% Beef.",
                6.22,
                R.drawable.impossible

        ));

        food.put(2, new Food(
                2,
                "Cheeseburger",
                "You can’t go wrong with our cheeseburger, a signature flame-grilled. beef patty topped with a simple layer of melted American cheese, crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.",
                4.33,
                R.drawable.cheeseburger

        ));

        food.put(3, new Food(
                3,
                "Bacon Double Cheeseburger",
                "Make room for our Bacon Double Cheeseburger, two signature flame-grilled beef patties topped with smoked bacon and a simple layer of melted American cheese, crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.",
                5.56,
                R.drawable.bacon

        ));

        food.put(4, new Food(
                4,
                "Crispy Chicken Caesar",
                "Our New Crispy Chicken Caesar Sandwich is made with 100% white meat seasoned chicken filet, battered and breaded, and carefully layered with fresh lettuce, ripe tomato, creamy Caesar sauce, bacon, and shaved parmesan cheese all on a potato bun.",
                4.45,
                R.drawable.crispy

        ));

        food.put(5, new Food(
                5,
                "Spicy Crispy Chicken Sandwich",
                "Introducing the Spicy Crispy Chicken Sandwich made with juicy, tender and crispy 100% white meat chicken, seasoned and breaded with bold flavors and just the right amount of heat; topped with fresh lettuce, a ripe tomato, and creamy mayonnaise all on a potato bun.",
                5.29,
                R.drawable.spicy

        ));

        food.put(6, new Food(
                6,
                "Original Chicken Sandwich",
                "Our Original Chicken Sandwich is made with white meat chicken, lightly breaded and topped with a simple combination of shredded lettuce and creamy mayonnaise on a sesame seed bun.",
                4.05,
                R.drawable.og

        ));

        food.put(7, new Food(
                7,
                "Chicken Fries",
                "Made with white meat chicken, our Chicken Fries are coated in a light crispy breading seasoned with savory spices and herbs. \n" +
                        "Chicken Fries are shaped like fries and are perfect to dip in any of our delicious dipping sauces. Choose from BBQ, Honey Mustard, Ranch, Zesty, Buffalo and Sweet & Sour.",
                3.51,
                R.drawable.chickenfries

        ));

        food.put(8, new Food(
                8,
                "Chicken Nuggets",
                "Made with white meat, our bite-sized Chicken Nuggets are tender and juicy on the inside and crispy on the outside. \n" +
                        "Coated in a homestyle seasoned breading, they are perfect for dipping in any of our delicious dipping sauces.",
                3.99,
                R.drawable.nuggs

        ));

        food.put(9, new Food(
                9,
                "Big Fish",
                "Our premium Big Fish Sandwich is 100% White Alaskan Pollock, breaded with crispy panko breading and topped with sweet tartar sauce, tangy pickles, all on top of a toasted brioche-style bun.",
                5.03,
                R.drawable.fish

        ));

        food.put(10, new Food(
                10,
                "Chicken Garden Salad",
                "Our Chicken Garden Salad is a mix of crisp green romaine, green leaf and radicchio lettuce, juicy-ripened tomatoes, buttery garlic croutons, and shredded cheddar cheese.",
                4.56,
                R.drawable.salad

        ));

        food.put(11, new Food(
                11,
                "French Fries",
                "More delicious than ever, our signature piping hot, thick cut Salted French Fries are golden on the outside and fluffy on the inside.",
                1.02,
                R.drawable.fries

        ));

        food.put(12, new Food(
                12,
                "Onion Rings",
                "Served hot and crispy, our golden Onion Rings are the perfect treat for plunging into one of our bold or classic sauces.",
                1.23,
                R.drawable.rings

        ));

        food.put(13, new Food(
                13,
                "Mozzarella Sticks",
                "Mozzarella cheese coated in an Italian-style seasoned breading, fried crispy until golden brown and served hot and melty with a marinara dipping sauce.",
                1.31,
                R.drawable.mozz

        ));

        food.put(14, new Food(
                14,
                "Dr. Pepper",
                "Dr Pepper has 23 exciting flavors for a taste that’s cool, refreshing, and unique.",
                1.06,
                R.drawable.dp

        ));

        food.put(15, new Food(
                15,
                "Coca-Cola",
                "Perfect with any meal, enjoy the genuine taste of Coca-Cola.",
                1.01,
                R.drawable.coke

        ));
    }

}
