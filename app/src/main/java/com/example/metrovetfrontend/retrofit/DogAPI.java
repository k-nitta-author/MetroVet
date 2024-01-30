package com.example.metrovetfrontend.retrofit;


import com.example.metrovetfrontend.model.Dog;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
public interface DogAPI {

    @GET("/")
    Call<List<Dog>> getAllUsers();

}
