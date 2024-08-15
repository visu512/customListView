package com.example.customlistview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Item> items = new ArrayList<>();
        items.add(new Item(R.drawable.man1, "Aman Maurya "));
        items.add(new Item(R.drawable.man2, "Vishal Kushwaha"));
        items.add(new Item(R.drawable.man3, "Rahul kumar"));
        items.add(new Item(R.drawable.man1, "Aman Maurya "));
        items.add(new Item(R.drawable.man2, "Vishal Kushwaha"));
        items.add(new Item(R.drawable.man3, "Rahul kumar"));
        items.add(new Item(R.drawable.man1, "Aman Maurya "));
        items.add(new Item(R.drawable.man2, "Vishal Kushwaha"));
        items.add(new Item(R.drawable.man3, "Rahul kumar"));
        items.add(new Item(R.drawable.man1, "Aman Maurya "));
        items.add(new Item(R.drawable.man2, "Vishal Kushwaha"));
        items.add(new Item(R.drawable.man3, "Rahul kumar"));
        items.add(new Item(R.drawable.man1, "Aman Maurya "));
        items.add(new Item(R.drawable.man2, "Vishal Kushwaha"));
        items.add(new Item(R.drawable.man3, "Rahul kumar"));

        CustomAdapter adapter = new CustomAdapter(this, items);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
