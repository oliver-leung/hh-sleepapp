package com.sleep.sleepapp;

/**
 * Created by 2718281828 on 3/3/18.
 */



public class patientInfo {
    static private String name = "Testbob Defaultpants"; //Legal name
    static private String sex = "m"; //"m" or "f"
    static private int weight =  999; //weight in pounds
    static private int height =  999; //height in inches
    static private SleepInfo sInfo; //stores Sleep Info

    private patientInfo(){

    }

    public static int getWeight(){
        return weight;
    }
    public static int getHeight(){
        return height;
    }
    public static void setWeight(int w){
        if(w>0){weight=w;}
    }
    public static void setHeight(int h){
        if(h>0){height=h;}
    }




}
