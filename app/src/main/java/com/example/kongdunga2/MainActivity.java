package com.example.kongdunga2;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextInputEditText username, password;
    Button signInBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.userNameEdTxt);
        password = findViewById(R.id.passwordEdTxt);
        signInBtn = findViewById(R.id.signInBtn);
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });


    }

    private void signIn() {

        String user = username.getText().toString().trim();
        String pass = password.getText().toString().trim();

        if (checkuser(user) && checkpass(pass)) {

            Intent intent=new Intent(MainActivity.this,Menu.class);
            startActivity(intent);

        }

    }

    private boolean checkuser(String usern) {

        if (TextUtils.isEmpty(usern)) {

            username.setError("fiil username!!");
            return false;
        }

        return true;

    }

    private boolean checkpass(String pass) {

        if (TextUtils.isEmpty(pass)) {

            password.setError("fiil password!!");
            return false;
        }

        return true;

    }

    public void goInformation(View view){

        Intent i= new Intent(MainActivity.this,Information.class);
        startActivity(i);

    }
}
