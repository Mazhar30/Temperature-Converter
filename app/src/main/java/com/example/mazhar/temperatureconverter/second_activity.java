package com.example.mazhar.temperatureconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.view.View;
import android.widget.TextView;

/**
 * Created by mazhar on 3/5/2018.
 */

public class second_activity extends AppCompatActivity {

    EditText et,et1;
    RadioButton rb1;
    RadioButton rb2;
    double c,value;

    operation obj = new third_activity();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button but= (Button) findViewById(R.id.button2);
        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                gotosubmit();
            }
        });
        Button bu=(Button) findViewById(R.id.button3);
        bu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                gotomainActivity();
            }
        });
        et = (EditText) findViewById(R.id.editText4);
        et1 = (EditText) findViewById(R.id.editText);
        rb1= (RadioButton) findViewById(R.id.radioButton);
        rb2= (RadioButton) findViewById(R.id.radioButton2);
    }
    public void gotosubmit(){
        double c = new Double(et.getText().toString());
        if(rb1.isChecked())
            value=obj.c2f(c);
        else
            value=obj.f2c(c);
        et1.setText(new Double(value).toString());
    }
    public void gotomainActivity(){
        Intent intent = new Intent(this, Main_Activity.class);
        startActivity(intent);
    }
}
