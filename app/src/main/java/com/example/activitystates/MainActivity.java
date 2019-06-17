package com.example.activitystates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String tag = "Message : ";
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(tag,"This is from onCreate()");

        btn = findViewById(R.id.btn_check);


        btn.setOnClickListener(new View.OnClickListener() {
                @Override
            public void onClick(View v) {
                Log.d("Click","i clicked on Button!");
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(tag,"This is from onResume()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(tag,"This is from onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(tag,"This is from onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(tag,"This is from onDestroy()");
    }



    @Override
    protected void onPause() {
        super.onPause();

        Log.d(tag,"This is from onPause()");
    }



}
