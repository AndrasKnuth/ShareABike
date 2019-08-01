package com.shortit.kryptonite.Retrofit;

import java.io.IOException;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Component
public class BitlyClient {

  private BitlyInterface bitlyInterface;

  public BitlyClient() {
    Retrofit retrofit =
        new Retrofit.Builder()
            .baseUrl("https://api-ssl.bitly.com/v4")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    this.bitlyInterface = retrofit.create(BitlyInterface.class);
  }

  public BitlyModel getShortUrl() throws IOException {

    String token = "DSADSADASDASDSDADDSD";
    Call<BitlyModel> callSync = bitlyInterface.shortenUrl(token);

    Response<BitlyModel> response = callSync.execute();

    if (!response.isSuccessful()) {
      throw new IOException(
          response.errorBody() != null ? response.errorBody().string() : "Unknown Error");
    }
    return response.body();
  }
}
