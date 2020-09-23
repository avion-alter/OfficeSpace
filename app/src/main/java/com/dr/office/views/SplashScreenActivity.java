package com.dr.office.views;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.dr.office.R;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /*if (sessionManager.getBooleanKey(SessionKeyConstant.KEY_is_login)) {
                    Intent n = new Intent(SplashScreenActivity.this, MainActivity.class);
                    n.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(n);
                    finish();
                } else {
                    Intent n = new Intent(SplashScreenActivity.this, LoginActivity.class);
                    n.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(n);
                    finish();
                }*/
                Intent n = new Intent(SplashScreenActivity.this, LoginSIgnUpActivity.class);
                n.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(n);
                finish();

            }
        }, SPLASH_TIME_OUT);
    }
}