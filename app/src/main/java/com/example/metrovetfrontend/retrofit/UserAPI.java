package com.example.metrovetfrontend.retrofit;


import com.example.metrovetfrontend.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserAPI {


    // access a user
    @GET("/")
    Call<List<User>> getAllUsers();





}


