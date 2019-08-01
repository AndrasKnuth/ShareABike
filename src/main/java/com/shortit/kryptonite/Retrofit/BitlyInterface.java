package com.shortit.kryptonite.Retrofit;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface BitlyInterface {
  @POST("/shorten")
  Call<BitlyModel> shortenUrl(@Header("authorization") String token);
}
