package com.example.visualphysics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView NameOfModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.ModelRecent).setOnClickListener(
                v ->
        {
            Intent intent = new Intent(MainActivity.this, MakeModelActivity.class);
            startActivity(intent);
        });

    }
}