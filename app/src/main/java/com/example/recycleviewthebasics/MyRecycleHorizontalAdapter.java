package com.example.recycleviewthebasics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecycleHorizontalAdapter extends RecyclerView.Adapter<MyRecycleHorizontalAdapter.MyViewHolder> {

private Context context;
private String[] list_interns;
private int[] list_avatar;

    public MyRecycleHorizontalAdapter() {
    }



    public MyRecycleHorizontalAdapter(Context context, String[] list_interns, int[] list_avatar) {
        this.context = context;
        this.list_interns = list_interns;
        this.list_avatar = list_avatar;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_recycle_horizontal, parent, false);
       return new MyViewHolder(view);
       //
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
holder.list_interns.setText(list_interns[position]);
holder.list_avatar.setImageResource(list_avatar[position]);

    }

    @Override
    public int getItemCount() {
        return list_avatar.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
ImageView list_avatar;
TextView list_interns;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
             list_avatar = itemView.findViewById(R.id.iv_liste_avatar);
             list_interns = itemView.findViewById(R.id.tv_nom);

        }
    }
}
