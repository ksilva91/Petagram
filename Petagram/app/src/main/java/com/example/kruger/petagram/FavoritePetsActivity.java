package com.example.kruger.petagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.kruger.petagram.com.example.kruger.petagram.pojo.Pet;

import java.util.ArrayList;

public class FavoritePetsActivity extends AppCompatActivity {

    private ArrayList<Pet> pets = new ArrayList<>();
    private RecyclerView rvPets;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_pets);
        rvPets = findViewById(R.id.rv_pet_list);
        toolbar = findViewById(R.id.action_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvPets.setLayoutManager(llm);
        initializeList();
        initializeAdapter();
    }

    private void initializeList(){
        pets.add(new Pet(R.drawable.third_pet,"Max",17));
        pets.add(new Pet(R.drawable.fourth_pet,"Rufo",15));
        pets.add(new Pet(R.drawable.sixth_pet,"Lassie",10));
        pets.add(new Pet(R.drawable.seventh_pet,"Rudolf",7));
        pets.add(new Pet(R.drawable.eighth_pet,"Lulú",6));
    }

    private void initializeAdapter(){
        PetAdapter pa = new PetAdapter(pets);
        rvPets.setAdapter(pa);
    }
}
