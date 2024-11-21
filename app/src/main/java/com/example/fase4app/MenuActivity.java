package com.example.restaurantmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fase4app.DetailActivity;
import com.example.fase4app.R;

public class MenuActivity extends AppCompatActivity {
    private String[] dishes = {"Dish 1", "Dish 2", "Dish 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ListView lvMenuItems = findViewById(R.id.lv_menu_items);
        String category = getIntent().getStringExtra("category");
        setTitle(category);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, dishes
        );
        lvMenuItems.setAdapter(adapter);

        lvMenuItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MenuActivity.this, DetailActivity.class);
                intent.putExtra("dish", dishes[position]);
                startActivity(intent);
            }
        });
    }
}
