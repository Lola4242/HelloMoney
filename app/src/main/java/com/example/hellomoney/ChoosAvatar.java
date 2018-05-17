package com.example.hellomoney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.hellomoney.model.Child;

public class ChoosAvatar extends AppCompatActivity {

    public Child child = new Child();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choos_avatar);
    }

    public void child1(View view){
        Intent intent = new Intent(this, ChoosAvatar.class);
        child.setAvatar(1);
        intent.putExtra("child", child);
        startActivity(intent);
    }

    public void child2(View view){
        Intent intent = new Intent(this, ChoosAvatar.class);
        child.setAvatar(2);
        intent.putExtra("child", child);
        startActivity(intent);
    }

    public void child3(View view){
        Intent intent = new Intent(this, ChoosAvatar.class);
        child.setAvatar(3);
        intent.putExtra("child", child);
        startActivity(intent);
    }

    public void child4(View view){
        Intent intent = new Intent(this, ChoosAvatar.class);
        child.setAvatar(7);
        intent.putExtra("child", child);
        startActivity(intent);
    }

    public void child5(View view){
        Intent intent = new Intent(this, ChoosAvatar.class);
        child.setAvatar(5);
        intent.putExtra("child", child);
        startActivity(intent);
    }

    public void child6(View view){
        Intent intent = new Intent(this, ChoosAvatar.class);
        child.setAvatar(6);
        intent.putExtra("child", child);
        startActivity(intent);
    }

    public void child7(View view){
        Intent intent = new Intent(this, ChoosAvatar.class);
        child.setAvatar(7);
        intent.putExtra("child", child);
        startActivity(intent);
    }

    public void child8(View view){
        Intent intent = new Intent(this, ChoosAvatar.class);
        child.setAvatar(8);
        intent.putExtra("child", child);
        startActivity(intent);
    }

    public void child9(View view){
        Intent intent = new Intent(this, ChoosAvatar.class);
        child.setAvatar(9);
        intent.putExtra("child", child);
        startActivity(intent);
    }
}
