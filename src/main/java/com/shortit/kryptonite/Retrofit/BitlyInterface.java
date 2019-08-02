package com.shortit.kryptonite.Retrofit;

import model.ObjectToRetrofit;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BitlyInterface {

  @POST("/shorten")
  Call<BitlyModel> shortenUrl(@Header("AccessToken") String token, @Body ObjectToRetrofit objectToRetrofit);

}
