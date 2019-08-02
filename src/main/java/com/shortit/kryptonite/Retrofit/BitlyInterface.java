package com.shortit.kryptonite.Retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface BitlyInterface {

  @POST("/links")
  Call<RebrandlyModel> shortenUrl(@Header("Content-Type") String contentType,
      @Header("apikey")String apikey, @Body String destination);
}
