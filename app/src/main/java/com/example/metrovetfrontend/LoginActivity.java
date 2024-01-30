package com.example.metrovetfrontend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.metrovetfrontend.model.User;
import com.example.metrovetfrontend.retrofit.RetrofitService;
import com.example.metrovetfrontend.retrofit.UserAPI;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //RetrofitService retrofitService=new RetrofitService();
        //UserAPI userAPI = retrofitService.getRetrofit().create(UserAPI.class);

        // the variable for the login button
        Button loginButton = (Button) findViewById(R.id.LoginButton);



        //TextView usernameTextView = (TextView) findViewById(R.id.usernameTextView);
        //TextView passwordTextView = (TextView) findViewById(R.id.passwordTextView);
        loginButton.setOnClickListener(view ->{

            // when the login button is clicked, check for the password



                //String username = usernameTextView.getText().toString();
                //String password = passwordTextView.getText().toString();

                //User user = new User();




                // include below the code used to access the api

                Intent i = new Intent(getApplicationContext(), SelectionScreenActivity.class);


                startActivity(i);



        });

    }
}