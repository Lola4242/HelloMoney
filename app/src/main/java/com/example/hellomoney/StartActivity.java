package com.example.hellomoney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.hellomoney.model.Child;

public class StartActivity extends AppCompatActivity {

    public Child child = new Child();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void next(View view){
        Intent intent = new Intent(this, ChoosAvatar.class);
        child.setAvatar(2);
        intent.putExtra("test", child);
        startActivity(intent);
    }
}
