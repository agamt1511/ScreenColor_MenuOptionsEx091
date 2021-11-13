package com.example.screencolor_menuoptionsex091;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class color4 extends AppCompatActivity {
    View background4;
    Button goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color4);

        goBack = (Button) findViewById(R.id.goBack);
        background4 = (View) findViewById(R.id.bacground4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"Green");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String st = item.getTitle().toString();
        int id = item.getItemId();
        if (id==R.id.yellow){
            background4.setBackgroundColor(Color.rgb(255, 255, 0));
        }
        if (id==R.id.red){
            background4.setBackgroundColor(Color.rgb(255, 0, 0));
        }
        if (id==R.id.blue){
            background4.setBackgroundColor(Color.rgb(0, 0, 255));
        }
        if (st == "Green"){
            background4.setBackgroundColor(Color.rgb(0, 255, 0));
        }
        return super.onOptionsItemSelected(item);
    }

    public void back(View view) {
        background4.setBackgroundColor(Color.rgb(81, 45, 168));
        finish();
    }
}