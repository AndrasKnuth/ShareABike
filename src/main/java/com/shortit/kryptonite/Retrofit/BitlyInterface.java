package com.shortit.kryptonite.Retrofit;

import model.ObjectToRetrofit;
import org.springframework.http.HttpHeaders;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BitlyInterface {

  @POST("/shorten")
<<<<<<< HEAD
  Call<BitlyModel> shortenUrl(@Header("AccessToken") HttpHeaders headers, @Body ObjectToRetrofit objectToRetrofit);
=======
  Call<BitlyModel> shortenUrl(@Header("Access Token") String token, @Body ObjectToRetrofit objectToRetrofit);

>>>>>>> cd076405d3cad949813ffd6941db60740e3c4c46
}
