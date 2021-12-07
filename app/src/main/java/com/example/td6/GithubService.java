package com.example.td6;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GithubService {

    public static final String ENDPOINT = "https://api.github.com";

   // @GET("/users/{user}/repos")
  //  List<Repo> listRepos(@Path("user") String user);

    @GET("/search/repositories")
    List<Repo> searchRepos(@Query("q") String query);

    @GET("/users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);


}
