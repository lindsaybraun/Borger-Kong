package com.example.borgerkong;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FoodRecyclerFragment extends Fragment {

    private RecyclerView recyclerView;

    public FoodRecyclerFragment() {
        // Required empty public constructor
    }

    // Here the View object representing the Fragment is "inflated" from the layout file. You can
    // think of inflating as just transforming the XML to an actual View object that can be
    // displayed on screen. XML is just text. We need to inflate it to become an actual thing.
    //
    // If you want to do your own thing to the View (e.g. setText on specific TextViews, set up
    // RecyclerView, you can do it here. Alternatively, you may override onViewCreated and do the
    // set up there.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food_recycler, container, false);

        // Now I can do all my normal set up stuff
        recyclerView = view.findViewById(R.id.rv_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        FoodAdapter foodAdapter = new FoodAdapter();

        // We wrote our setData method to be like a setter, so we give our ArrayList from
        // FakeDatabase to the Adapter.
        foodAdapter.setData(FakeDatabase.getAllFood());
        recyclerView.setAdapter(foodAdapter);

        return view;
    }

}
