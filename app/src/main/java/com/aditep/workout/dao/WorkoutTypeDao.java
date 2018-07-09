package com.aditep.workout.dao;


import com.aditep.workout.R;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WorkoutTypeDao   {

    int[] imge = {R.drawable.chest,R.drawable.back,R.drawable.leg,R.drawable.arm,R.drawable.shoulder,R.drawable.abs};

    public int[] getImge() {
        return imge;
    }

    public String[] getName() {
        return name;
    }

    String[] name = {"CHEST","BACK","LEGS","ARMS","SHOULDER","ABS"};
}
