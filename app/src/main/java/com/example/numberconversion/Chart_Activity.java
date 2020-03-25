package com.example.numberconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chart_Activity extends AppCompatActivity {
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_);


        back=(Button) findViewById(R.id.chat_to_home);
        back.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chart_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
}
    }
