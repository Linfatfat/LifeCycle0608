package com.u1065115.lifecycle0608;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find   R   id
        Button btnDial = findViewById(R.id.btnDial);
        Button btnSecond = findViewById(R.id.btnSecond);
        Button btnFinish = findViewById(R.id.btnFinish);

        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();


        //設定 button   click   事件共用的傾聽    myListener
        btnDial.setOnClickListener(myListener);
    }
    private  Button.OnClickListener myListener= new Button.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}
