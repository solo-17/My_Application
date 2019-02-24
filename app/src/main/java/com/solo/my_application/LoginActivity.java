package com.solo.my_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    String msg = "Android: Main Activity ";
    EditText userName, password;

    private EditText getUserName() {
        return this.userName;
    }

    private EditText getPassword() {
        return this.password;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        addListenerOnButtonLogin();
        addListenerOnButtonSignUp();

        Log.d(msg,"On Create");
    }

    private void addListenerOnButtonLogin() {
        final Context context = this;
        Button button = (Button) findViewById(R.id.buttonLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void addListenerOnButtonSignUp() {
        final Context context = this;
        Button button = (Button) findViewById(R.id.buttonCreateAccount);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,SignupActivity.class);
                startActivity(intent);
            }
        });
    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart () {
        super.onStart();
        Log.d(msg,"On Start");
    }


}
