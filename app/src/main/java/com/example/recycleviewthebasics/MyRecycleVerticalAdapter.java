package com.example.recycleviewthebasics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecycleVerticalAdapter extends RecyclerView.Adapter<MyRecycleVerticalAdapter.MyViewHolder> {

    private Context context;
    private String[] interns, description;
    private int[] avatars;

    public MyRecycleVerticalAdapter(Context context, String[] interns, String[] description, int[] avatars) {
        this.context = context;
        this.interns = interns;
        this.description = description;
        this.avatars = avatars;
    }

    @NonNull
    @Override
    public MyRecycleVerticalAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_recycle_vertical, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyRecycleVerticalAdapter.MyViewHolder holder, int position) {
        // position = holder.getAdapterPosition();

        //On utilise object holder qui hérite de MyRecycleHolder pour peupler nos items
        //Ajout du texte
        holder.tv_title.setText(interns[position]);
        holder.tv_description.setText(description[position]);
        // Ajout de l'image avec setImageResource
        holder.iv_avatar.setImageResource(avatars[position]);
    }

    @Override
    public int getItemCount() {
        // nombre d'items de la liste en comptant le nombre d'image avec length
        return avatars.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_avatar;
        TextView tv_title, tv_description;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_avatar = itemView.findViewById(R.id.iv_avatar);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_description = itemView.findViewById(R.id.tv_description);
        }
    }
}
