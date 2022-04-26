package com.naufaldwimln.hellowolrd;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.naufaldwimln.hellowolrd.Class.Mitra;

import java.util.ArrayList;
import java.util.Random;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{
    ArrayList<Mitra> data = new ArrayList<>();
    Context context;
    public CustomAdapter(Context context, ArrayList<Mitra> personNames) {
        this.context = context;
        this.data = personNames;
    }

    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_supply, null));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {
        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;

        holder.name.setText("Mitra " + position);
        holder.age.setText("Stok: " + result);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), "Detail", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(view.getContext(), SupplyDetailActivity.class);
                intent.putExtra("_mitra", "Mitra " + position);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, age;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.examName);
            age = itemView.findViewById(R.id.examDate);
        }
    }
}
