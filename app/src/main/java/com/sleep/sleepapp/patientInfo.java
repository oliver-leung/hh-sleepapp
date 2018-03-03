package com.sleep.sleepapp;

/**
 * Created by 2718281828 on 3/3/18.
 */



public class patientInfo {
    static private String name; //Legal name
    static private String sex = "m"; //"m" or "f"
    static private double weight; //weight in pounds
    static private double height; //height in inches
    static private SleepInfo sInfo; //stores Sleep Info

    private patientInfo(){

    }

    public static double getWeight(){
        return weight;
    }
    public static double getHeight(){
        return height;
    }
    public static void setWeight(double w){
        if(w>0){weight=w;}
    }
    public static void setHeight(double h){
        if(h>0){height=h;}
    }




}
