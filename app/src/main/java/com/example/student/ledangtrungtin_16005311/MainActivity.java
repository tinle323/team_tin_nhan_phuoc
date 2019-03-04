package com.example.student.ledangtrungtin_16005311;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CustomListView(View view) {
        Intent it = new Intent(MainActivity.this, CustomListView.class);
        startActivity(it);
    }
}
