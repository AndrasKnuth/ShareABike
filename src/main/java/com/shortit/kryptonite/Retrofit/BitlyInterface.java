package com.shortit.kryptonite.Retrofit;

import model.ObjectToRetrofit;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface BitlyInterface {
  @POST("/shorten")
  Call<BitlyModel> shortenUrl(@Header("authorization") String token, @Body ObjectToRetrofit objectToRetrofit);
}
