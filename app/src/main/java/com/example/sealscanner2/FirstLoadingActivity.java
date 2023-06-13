package com.example.sealscanner2;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstLoadingActivity extends AppCompatActivity {

    Button button; // 버튼 변수 추가

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstloading);

        button = findViewById(R.id.button); // 버튼 찾기
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.button3); // 버튼 찾기
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NukkiDoneActivity.class);
                startActivity(intent);
            }
        });



//        setContentView(activityMainBinding.getRoot());
    }


}