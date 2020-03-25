package com.example.numberconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button about,convert,chart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about=(Button) findViewById(R.id.aboutId);
        convert=(Button) findViewById(R.id.convertId);
        chart=(Button) findViewById(R.id.chartId);

      about.setOnClickListener(new View.OnClickListener()
      {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,About_Activity.class);
                startActivity(intent);
            }
        });
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Convert_Activity.class);
                startActivity(intent);
            }
        });
        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Chart_Activity.class);
                startActivity(intent);
            }
        });
    }
}
