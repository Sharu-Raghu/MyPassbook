package agilestriders.assignment.com.mypasskbook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Sharanya on 2/06/2018.
 */

public class SplashActivity extends AppCompatActivity {
    //Sets the splash screen to last for 3 seconds.
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Opens the DashBoard screen after the 3 sec time out.

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        },
                SPLASH_TIME_OUT);
    }
}
