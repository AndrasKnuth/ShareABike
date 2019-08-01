package com.shortit.kryptonite.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BitlyInterface {
  @GET("/shorten")
  Call<BitlyModel> shortenUrl();
}
