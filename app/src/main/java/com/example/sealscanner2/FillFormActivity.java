package com.example.sealscanner2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.Nullable;

public class FillFormActivity extends AppCompatActivity {

    Button button; // 버튼 변수 추가

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fillform);

        button = findViewById(R.id.backmark); // 버튼 찾기
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //화면 합친 후 NukkiDoneActivity 대신에 카메라 화면 java 파일이름 넣기
                Intent intent = new Intent(getApplicationContext(), DoneActivity.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.button); // 버튼 찾기
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DoneActivity.class);
                startActivity(intent);
            }
        });

//        button = findViewById(R.id.button3); // 버튼 찾기
//        button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), DoneActivity.class);
//                startActivity(intent);
//            }
//        });

//        setContentView(activityMainBinding.getRoot());
    }


}
