package com.example.sealscanner2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import android.view.View;
import android.widget.Button;

import com.example.sealscanner2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //
    Button button; // 버튼 변수 추가
    private ImageView imageView;

    ProgressDialog customProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.new_stamp); // xml에서 id.new_stamp 이미지를 가져옴

        // 사진 파일 경로 (저장된 파일의 위치!)
//        String imagePath = "progress_bar1"; // 넣을 파일의 위치!!

//        // 사진 파일을 Bitmap으로 변환
//        Bitmap bitmap = BitmapFactory.decodeFile(imagePath);

        // 가져올 사진 파일을 Bitmap으로 변환  //R. + 가져올 이미지의 위치(drawable) 및 이름!
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.crop_done);

        // Bitmap을 ImageView에 설정
        imageView.setImageBitmap(bitmap);


//        setContentView(activityMainBinding.getRoot());
//        setContentView(R.layout.SubActivity);

        button = findViewById(R.id.button3); // 버튼 찾기


        //로딩창 객체 생성
        customProgressDialog = new ProgressDialog(this);
        //로딩창을 투명하게
//        customProgressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        // 배경을 흰색으로 설정
        customProgressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.WHITE));
        // 화면 전체를 흰색으로 덮기 위해 Window의 배경도 흰색으로 설정
            customProgressDialog.getWindow().getDecorView().setBackgroundResource(android.R.color.white);

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 로딩창 보여주기
                customProgressDialog.show();
            }
        });


        button = findViewById(R.id.backmark); // 버튼 찾기
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //화면 합친 후 NukkiDoneActivity 대신에 카메라 화면 java 파일이름 넣기
                Intent intent = new Intent(getApplicationContext(), NukkiDoneActivity.class);
                startActivity(intent);
            }
        });


        button = findViewById(R.id.button); // 버튼 찾기
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //화면 합친 후 NukkiDoneActivity 대신에 카메라 화면 java 파일이름 넣기
                Intent intent = new Intent(getApplicationContext(), NukkiDoneActivity.class);
                startActivity(intent);
            }
        });

//        setContentView(activityMainBinding.getRoot());
    }

    @Override
    public void onBackPressed() {

        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("SealScanner 앱을 종료하시겠습니까?");
        builder.setCancelable(true);

        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }
}