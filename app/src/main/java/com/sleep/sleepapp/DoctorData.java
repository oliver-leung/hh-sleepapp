package com.sleep.sleepapp;

import java.util.ArrayList;

/**
 * Created by 2718281828 on 3/3/18.
 */

public class DoctorData {
    private static ArrayList<QuestionnaireResult> data;

    private DoctorData(){

    }

    public static void addData(QuestionnaireResult q){
        data.add(q);
    }


}
