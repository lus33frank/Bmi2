package com.frankchang.bmi2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText etWeight;
    private EditText etHeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 畫面元件連結
        findViews();
    }

    // 畫面元件連結
    private void findViews() {
        etWeight = findViewById(R.id.etWeight);
        etHeight = findViewById(R.id.etHeight);
    }

    // 計算Bmi
    public void calculationOnClick(View view) {
        // 取值
        String w = etWeight.getText().toString();
        String h = etHeight.getText().toString();
        // 轉型
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        // 計算
        float bmi = weight / (height * height);
        // 轉頁
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("BMI", bmi);
        startActivity(intent);
    }

}
