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

public class FileSavedActivity extends AppCompatActivity {


    Button button;
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.file_saved);


        button = findViewById(R.id.backmark); // 버튼 찾기
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
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

//        setContentView(activityMainBinding.getRoot());

    }

}
