package com.example.kruger.petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.kruger.petagram.com.example.kruger.petagram.pojo.Pet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Pet> pets = new ArrayList<>();
    private RecyclerView rvPets;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPets = findViewById(R.id.rv_pet_list);
        toolbar = findViewById(R.id.action_bar);
        setSupportActionBar(toolbar);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvPets.setLayoutManager(llm);
        initializeList();
        initializeAdapter();
    }

    private void initializeList(){
        pets.add(new Pet(R.drawable.first_pet,"Bobby",0));
        pets.add(new Pet(R.drawable.second_pet,"Scooby",0));
        pets.add(new Pet(R.drawable.third_pet,"Max",0));
        pets.add(new Pet(R.drawable.fourth_pet,"Rufo",0));
        pets.add(new Pet(R.drawable.fifth_pet,"Bethoven",0));
        pets.add(new Pet(R.drawable.sixth_pet,"Lassie",0));
        pets.add(new Pet(R.drawable.seventh_pet,"Rudolf",0));
        pets.add(new Pet(R.drawable.eighth_pet,"Lulú",0));
    }

    private void initializeAdapter(){
        PetAdapter pa = new PetAdapter(pets);
        rvPets.setAdapter(pa);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_star:
                Intent intent = new Intent(MainActivity.this, FavoritePetsActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
