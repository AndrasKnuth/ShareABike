package com.shortit.kryptonite.Retrofit;

import model.ObjectToRetrofit;
import org.springframework.http.HttpHeaders;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface BitlyInterface {

  @POST("/shorten")
  Call<BitlyModel> shortenUrl(@Header("AccessToken") String token);
}
