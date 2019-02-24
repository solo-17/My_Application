package com.solo.my_application;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String msg = "Android: Main Activity ";

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

        String status = "Connection Status" + String.valueOf(isNetworkAvailable());
        //status.concat(String.valueOf(isNetworkAvailable()));
        Log.d(msg,"On Create");
        Log.d(msg,status);
    }

    private void addListenerOnButton() {
        final Context context = this;
        Button button = (Button) findViewById(R.id.buttonStart);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , LoginActivity.class);
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

    private boolean isNetworkAvailable() {
        boolean connected = false;
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        //NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        //return activeNetworkInfo != null && activeNetworkInfo.isConnected();

        if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            connected = true;
        }
        else
            connected = false;

        return connected;
    }

}
