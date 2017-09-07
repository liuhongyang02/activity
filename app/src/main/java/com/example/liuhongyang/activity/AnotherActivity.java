package com.example.liuhongyang.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {
    TextView textView;
    String str;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        textView = (TextView)findViewById(R.id.textview);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

    final Button button = (Button)findViewById(R.id.anotherbutton);
        Intent intent= getIntent();
        String name = intent.getStringExtra("name");
        Integer age =  intent.getIntExtra("age",20);
        Integer count = 0;
        count+=1;
        intent.putExtra("result","姓名："+name+"年龄"+age+"次数"+count);

        str = "从首页获取:"+name + " "+age.toString();
        setResult(0,intent);
        textView.setText(str);
        button.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v)
        {
            //Toast.makeText(AnotherActivity.this,str, Toast.LENGTH_SHORT).show();
            //textView.setPadding(10, 10, 10, 10);

            finish();

        }

    });
    }
}
