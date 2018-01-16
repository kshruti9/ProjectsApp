package com.example.bindu.appprojectbudget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Goals extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.appprojectbudget.EXTRA_MESSAGE";
    //private EditText b;
    //private EditText p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);
        //b = (EditText) findViewById(R.id.budget);
        //p = (EditText) findViewById(R.id.personal);
        //final String bString = b.getText().toString();
        //final String pString = p.getText().toString();
        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendMessage(v);
                //startActivity(new Intent(Goals.this, MainActivity.class));
            }
        });
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText b = (EditText) findViewById(R.id.budget);
        EditText p = (EditText) findViewById(R.id.personal);
        //final String bString = b.getText().toString();
        //final String pString = p.getText().toString();
        String message = b.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        Intent intent2 = new Intent(this, MainActivity.class);
    }
}
