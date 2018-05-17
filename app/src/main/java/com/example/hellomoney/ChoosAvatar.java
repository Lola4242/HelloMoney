package com.example.hellomoney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hellomoney.model.Child;

public class ChoosAvatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choos_avatar);
        Child child = (Child) getIntent().getParcelableExtra("test");
        System.out.println(child.getAvatar());
    }
}
