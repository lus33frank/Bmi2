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

        // 畫面元件連結
        findViews();
    }

    // 畫面元件連結
    private void findViews() {
        tvShow = findViewById(R.id.tvShowBmi);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // 取得傳遞值
        float bmi = getIntent().getFloatExtra("BMI", 0.0f);
        // 塞值
        String showBmi = "Your Bmi is : " + bmi;
        tvShow.setText(showBmi);
    }
}
