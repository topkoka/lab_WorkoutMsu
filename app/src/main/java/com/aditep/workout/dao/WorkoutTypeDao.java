package com.aditep.workout.dao;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WorkoutTypeDao   {

    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("name")
    @Expose
    private String name;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
