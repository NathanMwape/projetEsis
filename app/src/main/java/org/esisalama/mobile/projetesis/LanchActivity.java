package org.esisalama.mobile.projetesis;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LanchActivity extends AppCompatActivity {

    Handler hand = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanch);
        // cacher l'actiionBar  // manifeste : android:theme="@style/Theme.AppCompat.NoActionBar"
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //Splash screen
        hand.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LanchActivity.this,HomePageActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}