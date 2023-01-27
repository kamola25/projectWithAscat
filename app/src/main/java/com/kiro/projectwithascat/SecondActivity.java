package com.kiro.projectwithascat;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kiro.projectwithascat.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String result = getIntent().getStringExtra("result");
        binding.textView.setText(result);
        binding.btn2.setOnClickListener(view -> {
            Intent intent = new Intent(SecondActivity.this,MainActivity.class);
            intent.putExtra("clear" ,binding.textView.getText().equals(""));
            startActivity(intent);
        });
}}