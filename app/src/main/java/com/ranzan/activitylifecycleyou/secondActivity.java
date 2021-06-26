package com.ranzan.activitylifecycleyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class secondActivity extends AppCompatActivity {
    private final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = new Intent(secondActivity.this, thirdActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "on start");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "on resume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "on pause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "on stop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "on restart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "on destroy");

    }
}