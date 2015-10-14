package com.example.triton.royal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.logging.Handler;

/**
 * Created by Triton on 10/14/2015.
 */
public class SplashscreenActivity extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreenlayout);
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                intent = new Intent(SplashscreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
    },3000);
}
}