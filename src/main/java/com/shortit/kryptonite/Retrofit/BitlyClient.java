package com.shortit.kryptonite.Retrofit;

import java.io.IOException;
import model.ObjectToRetrofit;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@Service
public class BitlyClient implements APIConfiguration {

  private BitlyInterface bitlyInterface;

  public BitlyClient() {
    Retrofit retrofit =
        new Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    this.bitlyInterface = retrofit.create(BitlyInterface.class);
  }

  public BitlyModel getShortUrl(String groupGuid, String longUrl) throws IOException {
    String token = "7362de8f2bdf1f74a6a577214f0565a296f4a6b8";

    //    HttpHeaders headers = new HttpHeaders();
    //
    //    headers.setContentType(MediaType.APPLICATION_JSON);
    //    headers.add("Access Token", token);

    ObjectToRetrofit objectToRetrofit = new ObjectToRetrofit(groupGuid, longUrl);

    Call<BitlyModel> callSync = bitlyInterface.shortenUrl("Bearer " + token);

    Response<BitlyModel> response = callSync.execute();

    if (!response.isSuccessful()) {
      throw new IOException(
          response.errorBody() != null ? response.errorBody().string() : "Unknown Error");
    }
    return response.body();
  }
}
