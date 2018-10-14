package com.frankchang.bmi2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvShow = findViewById(R.id.tvShowBmi);
        float bmi = getIntent().getFloatExtra("BMI", 0.0f);
        tvShow.setText("Your Bmi is : " + bmi);
    }
}
