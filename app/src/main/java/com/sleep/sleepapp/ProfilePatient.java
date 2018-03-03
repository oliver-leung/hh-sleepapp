package com.sleep.sleepapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by vivian on 3/3/18.
 */

public class ProfilePatient extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_patient);
        TextView wtView = findViewById(R.id.weight);
        TextView htView = findViewById(R.id.height);
        wtView.setText(patientInfo.getWeight() + " lb");
        htView.setText(patientInfo.getHeight() + " in");


    }

}
