package com.naufaldwimln.hellowolrd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardOwnerActivity extends AppCompatActivity {

    private Button btn_mitra, btn_produk, btn_supply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_owner);

        btn_mitra = findViewById(R.id.button2);
        btn_produk = findViewById(R.id.button3);
        btn_supply = findViewById(R.id.button4);

        btn_mitra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardOwnerActivity.this, MitraActivity.class));
            }
        });

        btn_produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardOwnerActivity.this, ProdukActivity.class));
            }
        });

        btn_supply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardOwnerActivity.this, SupplyActivity.class));
            }
        });
    }
}