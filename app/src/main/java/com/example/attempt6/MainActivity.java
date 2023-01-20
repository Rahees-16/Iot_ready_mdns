package com.example.attempt6;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.nsd.NsdManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import com.example.attempt6.NSDDiscover.DiscoveryListener.*;

public class MainActivity extends AppCompatActivity {

    private NSDListen mNSDListener;
    private NSDDiscover mNSDDiscover;

    private Button mRegisterBtn;
    private Button mDiscoverBtn;
    private Button mSayHelloBtn;
    private NSDDiscover.DiscoveryListener mDiscoveryListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNSDListener = new NSDListen(this);

        mNSDDiscover = new NSDDiscover(this, mDiscoveryListener);

        mRegisterBtn = (Button) findViewById(R.id.register);
        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNSDListener.registerDevice();
            }
        });

        mDiscoverBtn = (Button) findViewById(R.id.discover);
        mDiscoverBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNSDDiscover.discoverServices();
            }
        });



        //Show selection alert dialog...


    }}