package com.example.borgerkong;

import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class OrderFragment extends Fragment {

    private RecyclerView recyclerView;
    private String[] names = {"Impossible Whooper", "Cheeseburger", "Bacon Double Cheeseburger", "Crispy Chicken Caesar", "Spicy Crispy Chicken Sandwich",
            "Original Chicken Sandwich", "Chicken Fries", "Chicken Nuggets", "Big Fish", "Chicken Garden Salad", "French Fries", "Onion Rings", "Mozzarella Sticks",
            "Dr. Pepper", "Coca-Cola"};
    private String[] qty = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
    private Double[] prices = {6.22, 4.33, 5.56, 4.45, 5.29, 4.05, 3.51, 3.99, 5.03, 4.56, 1.02, 1.23, 1.31, 1.06, 1.01};


    public OrderFragment() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    //recyclerview doesn't work!!

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_order, container, false);

        // Now I can do all my normal set up stuff
        recyclerView = view.findViewById(R.id.rv_order);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);


        TextView price = (TextView) view.findViewById(R.id.total_price);

        Double total = 0.0;

        qty = Singleton.getInstance().getArray();

        for(int i=0; i< qty.length; i++){

            total = total + (Integer.parseInt(qty[i])) * (prices[i]);
        }
        //calculate total price
        price.setText(String.format ("$ %.2f", total));

        OrderAdapter orderAdapter = new OrderAdapter(qty);
        //orderAdapter.setData(FakeDatabase.getAllFood());
        recyclerView.setAdapter(orderAdapter);

        return view;
    }






}
