package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class Settings extends AppCompatActivity {
    private Button buttonDevice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        setSupportActionBar(findViewById(R.id.mainToolbar));
        getSupportActionBar().setTitle("Settings");

        buttonDevice = (Button) findViewById(R.id.buttonDevices);
        buttonDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDevices();
            }
        });
    }
    public void openDevices() {
        Intent intent = new Intent(this, SelectBluetoothDevices.class);
        startActivity(intent);
    }

}