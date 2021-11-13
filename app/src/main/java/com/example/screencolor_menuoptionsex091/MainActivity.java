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
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    View background;
    Button toSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toSec = (Button) findViewById(R.id.toSec);
        background = (View) findViewById(R.id.bacground);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.yellow){
            background.setBackgroundColor(Color.rgb(255, 255, 0));
        }
        if (id==R.id.red){
            background.setBackgroundColor(Color.rgb(255, 0, 0));
        }
        if (id==R.id.blue){
            background.setBackgroundColor(Color.rgb(0, 0, 255));
        }
        return super.onOptionsItemSelected(item);
    }

    public void go(View view) {
        Intent si = new Intent(this, color4.class);
        background.setBackgroundColor(Color.rgb(1, 135, 134));
        startActivity(si);
    }
}