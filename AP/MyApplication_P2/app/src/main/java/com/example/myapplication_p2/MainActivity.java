package com.example.myapplication_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart Invoked!","on Started");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("onResume Invoked!","on Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause Invoked!","on Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop Invoked!","on Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy Invoked!","on Destroy");
    }
}