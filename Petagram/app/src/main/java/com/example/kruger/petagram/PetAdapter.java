package com.example.kruger.petagram;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kruger.petagram.com.example.kruger.petagram.pojo.Pet;

import java.util.ArrayList;

/**
 * Created by Kruger on 27/12/2017.
 */

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.PetViewHolder> {
    private ArrayList<Pet> pets;

    public PetAdapter(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public PetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_pet, parent, false);
        return new PetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final PetViewHolder holder, int position) {
        final Pet pet = pets.get(position);
        holder.ivImage.setImageResource(pet.getImage());
        holder.tvPetName.setText(pet.getName());
        holder.tvPetRating.setText(String.valueOf(pet.getRating()));
        holder.ivBone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pet.setRating(pet.getRating() + 1);
                holder.tvPetRating.setText(String.valueOf(pet.getRating()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    public static class PetViewHolder extends RecyclerView.ViewHolder {

        ImageView ivImage;
        ImageView ivBone;
        TextView tvPetName;
        TextView tvPetRating;

        public PetViewHolder(View itemView) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.iv_image);
            ivBone = itemView.findViewById(R.id.iv_bone);
            tvPetName = itemView.findViewById(R.id.tv_pet_name);
            tvPetRating = itemView.findViewById(R.id.tv_rating);
        }
    }
}
