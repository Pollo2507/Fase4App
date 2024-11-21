package com.example.restaurantmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fase4app.MenuActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEntradas = findViewById(R.id.btn_entradas);
        Button btnPrincipales = findViewById(R.id.btn_principales);
        Button btnBebidas = findViewById(R.id.btn_bebidas);
        Button btnPostres = findViewById(R.id.btn_postres);

        View.OnClickListener categoryClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("category", ((Button) v).getText().toString());
                startActivity(intent);
            }
        };

        btnEntradas.setOnClickListener(categoryClickListener);
        btnPrincipales.setOnClickListener(categoryClickListener);
        btnBebidas.setOnClickListener(categoryClickListener);
        btnPostres.setOnClickListener(categoryClickListener);
    }
}
