package com.example.chira.calci2ndscreentask;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class Second extends AppCompatActivity {
    TextView t1;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b1=(Button)findViewById(R.id.button2);
        t1=(TextView)findViewById(R.id.textView);
        Intent j=getIntent();
        String s4=j.getStringExtra("data");
        t1.setText(s4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(Second.this,MainActivity.class);
            }
        });

    }
}
