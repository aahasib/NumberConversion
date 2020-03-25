package com.example.numberconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.TextView;

public class About_Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView aTextView , bTextView, cTextView,dTextView,eTextView;
    private ImageView aboutToHome;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_);

        aTextView = (TextView) findViewById(R.id.aTextId);
        bTextView = (TextView) findViewById(R.id.bTextId);
        cTextView = (TextView) findViewById(R.id.cTextId);
        dTextView = (TextView) findViewById(R.id.dTextId);
        eTextView = (TextView) findViewById(R.id.eTextId);
        aboutToHome = (ImageView) findViewById(R.id.aboutToHomeId);


        aTextView.setOnClickListener(this);
        bTextView.setOnClickListener(this);
        bTextView.setOnClickListener(this);
        cTextView.setOnClickListener(this);
        dTextView.setOnClickListener(this);
        eTextView.setOnClickListener(this);
        aboutToHome.setOnClickListener(this);

        aboutToHome.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(About_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });




    }
        @Override
        public void onClick (View v)
        {
            if (v.getId() == R.id.aTextId)
            {
                aTextView.setVisibility(v.GONE);
                bTextView.setVisibility(v.VISIBLE);
            }
            else if (v.getId() == R.id.bTextId)
            {
                bTextView.setVisibility(v.GONE);
                cTextView.setVisibility(v.VISIBLE);

            }
            else if (v.getId() == R.id.cTextId)
            {
                cTextView.setVisibility(v.GONE);
                dTextView.setVisibility(v.VISIBLE);

            }
            else if (v.getId() == R.id.dTextId)
            {
                dTextView.setVisibility(v.GONE);
                eTextView.setVisibility(v.VISIBLE);

            }
            else if (v.getId() == R.id.eTextId)
            {
               aboutToHome.setVisibility(v.VISIBLE);
            }

        }
}
