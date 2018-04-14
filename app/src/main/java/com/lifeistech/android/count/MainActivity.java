package com.lifeistech.android.count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    TextView textView3;
    int number;
    int number2;
    int number3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3=(TextView)findViewById(R.id.textView3);
    }

    public void add(View v){
        number = number+1;
        textView.setText(number + "回押されました！");
    }

    public void minus(View v){
        number = number-1;
        textView.setText(number + "回押されました！");
    }

    public void add2(View v){
        number2=number2+1;
        textView2.setText(number2 +"回押されました！");
    }

    public void sum(View x){
        number3= number+number2;
        textView3.setText(number3+"回押されました！");
    }

}
