package agilestriders.assignment.com.mypasskbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


import com.google.firebase.auth.FirebaseAuth;



/**
 * Created by Sharanya on 2/06/2018.
 */

public class DashboardActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    ImageView Logout;
    ImageView notes;
    ImageView tips;
    ImageView forum;
    ImageView settings;
    ImageView calendar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        firebaseAuth = FirebaseAuth.getInstance();

        Logout = (ImageView) findViewById(R.id.Logout);
        notes = (ImageView) findViewById(R.id.Lnotes);
        settings = (ImageView) findViewById(R.id.settings);
        tips = (ImageView) findViewById(R.id.tips);
        forum = (ImageView) findViewById(R.id.forum);
        calendar = (ImageView) findViewById(R.id.calendar);


        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logout();
            }
        });

        settings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,SettingsActivity.class));
            }
        });

        notes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,MyNoteActivity.class));
            }
        });

        tips.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,TipsActivity.class));
            }
        });


        calendar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, AlarmActivity.class));
            }
        });


       /* forum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,MainActivity.class));
            }
        });*/
    }
    private void Logout(){
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(DashboardActivity.this, LoginActivity.class));
    }

}
