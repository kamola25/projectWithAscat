package com.kiro.projectwithascat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.kiro.projectwithascat.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String clear = getIntent().getStringExtra("clear");
        binding.editText.setText(clear);

        binding.button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("result",binding.editText.getText().toString());
            startActivity(intent);

        });

    }
}