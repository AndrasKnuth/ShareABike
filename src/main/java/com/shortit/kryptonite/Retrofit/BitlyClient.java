package com.shortit.kryptonite.Retrofit;

import java.io.IOException;
import model.ObjectToRetrofit;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class BitlyClient {

  private BitlyInterface bitlyInterface;

  public BitlyClient() {
    Retrofit retrofit =
        new Retrofit.Builder()
            .baseUrl("https://api-ssl.bitly.com/v4/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    this.bitlyInterface = retrofit.create(BitlyInterface.class);
  }

  public BitlyModel getShortUrl(String groupGuid,String longUrl) throws IOException {

    ObjectToRetrofit objectToRetrofit = new ObjectToRetrofit(groupGuid, longUrl);
    String token = "7362de8f2bdf1f74a6a577214f0565a296f4a6b8";
    Call<BitlyModel> callSync = bitlyInterface.shortenUrl(token, objectToRetrofit);

    Response<BitlyModel> response = callSync.execute();

    if (!response.isSuccessful()) {
      throw new IOException(
          response.errorBody() != null ? response.errorBody().string() : "Unknown Error");
    }
    return response.body();
  }
}
