package com.sleep.sleepapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by vivian on 3/3/18.
 */

public class ReportPatient extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);
        final TextView qView = (TextView)findViewById(R.id.question);
        qView.setText(QuestionnaireResult.questions[QuestionnaireResult.currIndex]);
        qView.setHorizontallyScrolling(false);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        final QuestionnaireResult qRes = new QuestionnaireResult(patientInfo.getName());
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(QuestionnaireResult.currIndex==2){
                qRes.setAns(2, true);
                DoctorData.addData(qRes);
                startActivity(new Intent(ReportPatient.this, ProfilePatient.class));


                QuestionnaireResult.currIndex=0;
            }
            else{
                qRes.setAns(QuestionnaireResult.currIndex, true);
                QuestionnaireResult.currIndex++;
                qView.setText(QuestionnaireResult.questions[QuestionnaireResult.currIndex]);
            }


            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(QuestionnaireResult.currIndex==2){
                    qRes.setAns(2, false);
                    DoctorData.addData(qRes);
                    //RETURN TO HOME PAGE
                    QuestionnaireResult.currIndex=0;
                }
                else{
                    qRes.setAns(QuestionnaireResult.currIndex, false);
                    QuestionnaireResult.currIndex++;
                    qView.setText(QuestionnaireResult.questions[QuestionnaireResult.currIndex]);
                }


            }
        });






    }

}
