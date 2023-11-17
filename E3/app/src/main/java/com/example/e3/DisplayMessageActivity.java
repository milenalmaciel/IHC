package com.example.e3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        TextView textViewMessage = findViewById(R.id.textView);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");

        if (message != null) {
            textViewMessage.setText(message);
        }
    }
}