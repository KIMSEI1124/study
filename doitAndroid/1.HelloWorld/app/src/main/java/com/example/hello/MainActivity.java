package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked1(View v) {
        Toast.makeText(this,"확인1 버튼이 눌렸어요.", Toast.LENGTH_LONG).show();
    }

    public void onButtonClicked2(View v) {
        Intent myIntend = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntend);
    }

    public void onButtonClicked3(View v) {
        Intent myIntend = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 010-1000-1000"));
        startActivity(myIntend);
    }
}