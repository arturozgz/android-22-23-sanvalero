package com.example.retrofit.retrofit.Interface;

import com.example.retrofit.retrofit.model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Posts>> getPosts();
}
