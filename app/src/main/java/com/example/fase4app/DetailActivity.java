package com.example.restaurantmenu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fase4app.R;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvDishName = findViewById(R.id.tv_dish_name);
        Button btnAddToCart = findViewById(R.id.btn_add_to_cart);

        String dishName = getIntent().getStringExtra("dish");
        tvDishName.setText(dishName);

        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes implementar lógica para guardar en SQLite
                finish();
            }
        });
    }
}
