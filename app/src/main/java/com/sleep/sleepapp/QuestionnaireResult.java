package com.sleep.sleepapp;

import android.os.SystemClock;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by 2718281828 on 3/3/18.
 */

public class QuestionnaireResult {


    static final String[] questions = {"How did you sleep?", "How tired are you?", "How happy are you?"};
    static int currIndex; //from 0-2, gives current index of var questions
    boolean[] answers = new boolean[3]; // yes/no answer storage
    Date timestamp; //date that the object was constructed
    String patientName; //grabbed from patient's machine

    public QuestionnaireResult(String p){
        timestamp = Calendar.getInstance().getTime();
        patientName=p;
    }

    public void setAns(int i, boolean b){
        if(0<=i && i <= 2){answers[i]=b;}

    }







}
