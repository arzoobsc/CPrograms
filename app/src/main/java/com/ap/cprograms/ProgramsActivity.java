package com.ap.cprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProgramsActivity extends AppCompatActivity {

    TextView tvCode,tvHeading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);

        tvCode = findViewById(R.id.tv1);
        tvHeading = findViewById(R.id.tvheading);

        String heading = getIntent().getStringExtra("heading");
        tvHeading.setText(heading);

        String code = getIntent().getStringExtra("code");
        tvCode.setText(code);
    }
}
