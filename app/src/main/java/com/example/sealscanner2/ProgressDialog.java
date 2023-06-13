package com.example.sealscanner2;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import android.content.Intent;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.Button;
import android.view.View;


public class ProgressDialog extends Dialog {
    private Button button;

    public ProgressDialog(Context context) {
        super(context);
        // 다이얼로그 제목을 안보이게...
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialogprogress);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.WHITE));
        getWindow().getDecorView().setBackgroundResource(android.R.color.white);

        button = findViewById(R.id.backmark);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 버튼 클릭 시 동작 구현
                dismiss();  // 다이얼로그 닫기
            }
        });
    }
}