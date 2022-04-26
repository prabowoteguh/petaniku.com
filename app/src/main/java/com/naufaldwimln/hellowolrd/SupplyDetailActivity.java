package com.naufaldwimln.hellowolrd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class SupplyDetailActivity extends AppCompatActivity {

    private Spinner spinner_aing;
    private TextView nama_mitra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supply_detail);

        String mitra = getIntent().getStringExtra("_mitra");

        nama_mitra =findViewById(R.id.textSupplyJudul);
        nama_mitra.setText(mitra);

        spinner_aing = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence>adapter= ArrayAdapter.createFromResource(this, R.array.fruit, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner_aing.setAdapter(adapter);
    }
}