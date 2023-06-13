package com.example.sealscanner2;
import androidx.annotation.Nullable;
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

public class DoneActivity extends AppCompatActivity {

    Button button; // 버튼 변수 추가
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.done);

        imageView = findViewById(R.id.new_stamp); //xml에서 id.old.stamp를 가져옴
        // 사진 파일 경로 (저장된 파일의 위치!)
//        String imagePath = "progress_bar1"; // 넣을 파일의 위치!!

//        // 사진 파일을 Bitmap으로 변환
//        Bitmap bitmap = BitmapFactory.decodeFile(imagePath);

        // 가져올 사진 파일을 Bitmap으로 변환  //R. + 가져올 이미지의 위치(drawable) 및 이름!
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.old_stamp);
        // Bitmap을 ImageView에 설정
        imageView.setImageBitmap(bitmap);

        imageView = findViewById(R.id.new_stamp); //xml에서 id.new.stamp를 가져옴
        // 가져올 사진 파일을 Bitmap2으로 변환  //R. + 가져올 이미지의 위치(drawable) 및 이름!
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.crop_done);
        // Bitmap2을 ImageView에 설정
        imageView.setImageBitmap(bitmap2);


        button = findViewById(R.id.button); // 버튼 찾기
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NukkiDoneActivity.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.backmark); // 버튼 찾기
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NukkiDoneActivity.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.button); // 버튼 찾기
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NukkiDoneActivity.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.button3); // 버튼 찾기
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FillFormActivity.class);
                startActivity(intent);
            }
        });

//        setContentView(activityMainBinding.getRoot());
    }


}
