package com.example.matala3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn);
        btn2=findViewById(R.id.btn2);
        t1=findViewById(R.id.t);
    }
    int x;
    public void co(View view) { //click for number
        x=(int) (Math.random()*100+0);
        t1.setText(x+"=number");

    }

    public void yo(View view) {      //cancle
        t1.setText("number not faund");
    }
}
