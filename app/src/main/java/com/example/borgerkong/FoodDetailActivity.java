package com.example.borgerkong;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

import java.util.ArrayList;

public class FoodDetailActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView descriptionTextView;
    private TextView priceTextView;
    private ImageView imageView;

    private String[] names = {"Impossible Whooper", "Cheeseburger", "Bacon Double Cheeseburger", "Crispy Chicken Caesar", "Spicy Crispy Chicken Sandwich",
            "Original Chicken Sandwich", "Chicken Fries", "Chicken Nuggets", "Big Fish", "Chicken Garden Salad", "French Fries", "Onion Rings", "Mozzarella Sticks",
            "Dr. Pepper", "Coca-Cola"};
    public String[] qty = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};

    public ArrayList<String> nums = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);


        // Get the intent that was used to travel to this activity
        Intent intent = getIntent();

        // Get the extra identified by "ArticleID" that was put into the intent at the origin.
        int foodId = intent.getIntExtra("FoodID", 0);

        // Now that we were passed the ID of the clicked item, we can get the rest of the data
        // from the "database". Imagine this could be a real SQL database.
        final Food food = FakeDatabase.getFoodById(foodId);

        nameTextView = findViewById(R.id.detailName);
        descriptionTextView = findViewById(R.id.detailDescription);
        priceTextView = findViewById(R.id.detailPrice);
        imageView = findViewById(R.id.detailImage);

        // Set the views to show the data of our object
        nameTextView.setText(food.getName());
        descriptionTextView.setText(food.getDescription());
        priceTextView.setText("$" + food.getCost().toString());

        // Don't worry too much about images for now (but if you can get something to work then do)
        // Generally you don't want to store image data in your app (too much space required)
        // We'll learn the way to load images from the internet in a later week.

        // BUT we have included a way to show images that works for now.
        imageView.setImageResource(food.getImageDrawableId());


            final ElegantNumberButton button = (ElegantNumberButton) findViewById(R.id.qtyButton);
        button.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = button.getNumber();
            }

        });

        final Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                for(int i=0; i< names.length; i++){
                    if(food.getName().equals(names[i])) {
                        qty[i] = button.getNumber();
                    }
                }

                Singleton.getInstance().updateQty(qty);

                //go back to home page
                finish();
            }
        });

        TextView textView = (TextView) findViewById(R.id.detailName);
        String text = textView.getText().toString();


    }

}
