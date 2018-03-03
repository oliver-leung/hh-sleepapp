package com.sleep.sleepapp;

import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class UpdateInfo extends AppCompatActivity implements ActionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_info);

        Spinner wtSpinner = findViewById(R.id.weightSpinner);

        Integer[] pounds = new Integer[400];
        for(int i=0; i<pounds.length; i++){
            pounds[i]=i+1;
        }

        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_dropdown_item, pounds);

        wtSpinner.setAdapter(adapter);

        Spinner htSpinner = findViewById(R.id.heightSpinner);
//create a list of items for the spinner.
        Integer[] inches = new Integer[100];
        for(int i=0; i<inches.length; i++){
            inches[i]=i+1;
        }
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<Integer> adapter2 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_dropdown_item, inches);
//set the spinners adapter to the previously created one.
        htSpinner.setAdapter(adapter2);

        Button saveButton = findViewById(R.id.updateConfirmButton);
    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailure(int i) {

    }
}
