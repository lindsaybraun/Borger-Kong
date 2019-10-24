package com.example.borgerkong;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

//DOESN'T WORK!!! Failed Attempt at order recyclerview:

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    private String[] qty;
    private String[] names = {"Burger", "Fries", "chicken", "napkin"};
    //private int[] orders;
    private List<String> orders = new ArrayList<String>();
    private List<String> nonzero_qty = new ArrayList<String>();

    // RecyclerView recyclerView;
    public OrderAdapter(String[] qty) {
        this.qty = qty;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // First create a View from the layout file. It'll probably be a ViewGroup like
        // ConstraintLayout that contains more Views inside it.
        // This view now represents your entire one item.
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.order_layout, parent, false);

        // Then create an instance of your custom ViewHolder with the View you got from inflating
        // the layout.
        OrderViewHolder orderViewHolder = new OrderAdapter.OrderViewHolder(view);
        return orderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        // Compare what we have in this method, to what we used to have in MainActivity

        // 'position' is the index of the ViewHolder currently being bound (note VIEWHOLDER). So
        // if position is 0, then we are binding the first ViewHolder in the list. This means the
        // corresponding data object will be at index 0 of our data ArrayList.
        //String myQty = qty[position];

        for(int i = 0; i < qty.length; i ++){
            if(Integer.parseInt(qty[i]) != 0){
                orders.add(names[i]);
                nonzero_qty.add(qty[i]);
            }
        }

        String[] orderArray = new String[ orders.size() ];
        orders.toArray( orderArray );
        String[] qtyArray = new String[ nonzero_qty.size() ];
        nonzero_qty.toArray( qtyArray );

        Log.i("orders", orderArray[position]);
        Log.i("orders", qtyArray[position]);

        holder.nameTextView.setText(orderArray[position]);
        holder.qtyTextView.setText(qtyArray[position]);


    }

    @Override
    public int getItemCount() {
        return orders.size();
    }

    // ViewHolder represents one item, but doesn't have data when it's first constructed.
    // We assign the data in onBindViewHolder.
    public static class OrderViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView nameTextView;
        public TextView qtyTextView;


        // This constructor is used in onCreateViewHolder
        public OrderViewHolder(View v) {
            super(v);  // runs the constructor for the ViewHolder superclass
            view = v;
            nameTextView = v.findViewById(R.id.orderName);
            qtyTextView = v.findViewById(R.id.orderQty);

        }
    }

}
