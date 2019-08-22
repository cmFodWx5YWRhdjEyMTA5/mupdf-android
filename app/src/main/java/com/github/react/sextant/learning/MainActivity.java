package com.github.react.sextant.learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.artifex.mupdfdemo.ChoosePDFActivity;

public class MainActivity extends AppCompatActivity {

    private Button mSameScreenEnd; // 结束同屏

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);
        Intent intent = new Intent(this,ChoosePDFActivity.class);
        startActivity(intent);

//        mSameScreenEnd = (Button) findViewById(R.id.back);
//        mSameScreenEnd.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                System.out.println("LUOKUN");
//                Intent intent = new Intent(this,ChoosePDFActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
