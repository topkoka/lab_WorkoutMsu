package com.aditep.workout.manager.http;

import com.aditep.workout.dao.WorkoutTypedataDao;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiService {

    @POST("listtypemuscle")
    Call<WorkoutTypedataDao> loaddataList();
}
