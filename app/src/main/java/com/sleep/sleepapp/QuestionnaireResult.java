package com.sleep.sleepapp;

import android.os.SystemClock;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by 2718281828 on 3/3/18.
 */

public class QuestionnaireResult {


    static final String[] questions = {"How did you sleep last night?", "How are you feeling now?", "ghfjfhdhtey"};

    boolean[] answers; //length 3
    Date timestamp;

    public QuestionnaireResult(boolean[] answers){
        this.answers=answers;
        timestamp = Calendar.getInstance().getTime();
    }







}
