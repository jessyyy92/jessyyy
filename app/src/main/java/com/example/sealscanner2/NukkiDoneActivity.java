package com.example.sealscanner2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import android.view.View;
import android.widget.Button;

public class NukkiDoneActivity extends AppCompatActivity  {


    Button button;
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nukkidone);

        imageView = findViewById(R.id.new_stamp); //xml에서 id.new.stamp를 가져옴
        // 가져올 사진 파일을 Bitmap으로 변환  //R. + 가져올 이미지의 위치(drawable) 및 이름!
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.crop_done);
        // Bitmap을 ImageView에 설정
        imageView.setImageBitmap(bitmap);


        button = findViewById(R.id.backmark); // 버튼 찾기
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


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
                Intent intent = new Intent(getApplicationContext(), DoneActivity.class);
                startActivity(intent);
            }
        });

//        setContentView(activityMainBinding.getRoot());

    }

}
