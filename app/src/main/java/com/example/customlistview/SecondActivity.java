package com.example.customlistview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);

        // Get the data from the intent
        int imageResId = getIntent().getIntExtra("image",R.drawable.man1);
        String text = getIntent().getStringExtra("text");

        imageView.setImageResource(imageResId);
        textView.setText(text);
    }
}