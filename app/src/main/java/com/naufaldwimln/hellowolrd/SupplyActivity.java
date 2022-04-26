package com.naufaldwimln.hellowolrd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.naufaldwimln.hellowolrd.Class.Mitra;

import java.util.ArrayList;
import java.util.Arrays;

public class SupplyActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Mitra> data = new ArrayList<Mitra>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supply);

        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        // Manual Data Entry
        data.add(new Mitra("Mitra 1", "-"));
        data.add(new Mitra("Mitra 2", "-"));
        data.add(new Mitra("Mitra 3", "-"));
        data.add(new Mitra("Mitra 4", "-"));
        data.add(new Mitra("Mitra 5", "-"));

        CustomAdapter adapter = new CustomAdapter(SupplyActivity.this, data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
    }
}