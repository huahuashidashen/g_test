package com.example.gaolinhua.gtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getName();

    int age = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: ");
        Log.e(TAG, "onCreate: develop");
        age = 10;
        Log.e(TAG, "onCreate: this id develop_one " );
    }
}
