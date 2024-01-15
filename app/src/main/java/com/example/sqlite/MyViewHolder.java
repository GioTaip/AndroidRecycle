package com.example.sqlite;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView nameView, mailView, ageView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        nameView = itemView.findViewById(R.id.nameText);
        mailView = itemView.findViewById(R.id.mailText);
        ageView = itemView.findViewById(R.id.ageText);
    }
}
