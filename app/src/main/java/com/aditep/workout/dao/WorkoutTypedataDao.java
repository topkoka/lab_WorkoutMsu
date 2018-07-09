package com.aditep.workout.dao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WorkoutTypedataDao {

    @SerializedName("data")
    @Expose
    private List<WorkoutTypeDao> data = null;
    @SerializedName("success")
    @Expose
    private Boolean success;

    public List<WorkoutTypeDao> getData() {
        return data;
    }

    public void setData(List<WorkoutTypeDao> data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}