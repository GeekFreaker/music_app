package android.example.music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //a simple splash screen with a 5second delay(usually you'd be loading something here)

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent openSesame = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(openSesame);
                finish();
            }
        }, 5000);
    }
}
