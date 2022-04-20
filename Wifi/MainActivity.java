package com.example.wifi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_wifi_on, btn_wifi_off;
    WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_wifi_on = findViewById(R.id.btnTurnOn);
        btn_wifi_off = findViewById(R.id.btnTurnOff);

        btn_wifi_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifiManager.setWifiEnabled(true);
                Toast.makeText(MainActivity.this, "Wifi Turn ON", Toast.LENGTH_SHORT).show();

            }
        });

        btn_wifi_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifiManager.setWifiEnabled(false);
                Toast.makeText(MainActivity.this, "Wifi Turn OFF", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
