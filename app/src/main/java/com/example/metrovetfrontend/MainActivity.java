package com.example.metrovetfrontend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button adminButton = (Button) findViewById(R.id.AdminButton);
        Button userButton = (Button) findViewById(R.id.Userbutton);

        adminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent i = new Intent(getApplicationContext(), LoginActivity.class);

                //i.putExtra("is_user_admin", true);

                //startActivity(i);

            }
        });

        userButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), LoginActivity.class);

                i.putExtra("is_user_admin", false);

                startActivity(i);
            }
        });

    }


}