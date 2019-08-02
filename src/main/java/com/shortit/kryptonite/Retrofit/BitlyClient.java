package com.shortit.kryptonite.Retrofit;

import java.io.IOException;
import model.ObjectToRebrandly;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@Service
public class BitlyClient implements APIConfiguration {

  public String apikey = "dc53837134a84fb98c677216da8b7f3b";

  private BitlyInterface bitlyInterface;

  public BitlyClient() {
    Retrofit retrofit =
        new Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    this.bitlyInterface = retrofit.create(BitlyInterface.class);
  }

  public RebrandlyModel getShortUrl(String longUrl) throws IOException {

    //    HttpHeaders headers = new HttpHeaders();
    //
    //    headers.setContentType(MediaType.APPLICATION_JSON);
    //    headers.add("Access Token", token);

    ObjectToRebrandly objectToRebrandly = new ObjectToRebrandly(longUrl);

    Call<RebrandlyModel> callSync = bitlyInterface.shortenUrl(objectToRebrandly.getDestination(),
        apikey, longUrl);

    Response<RebrandlyModel> response = callSync.execute();

    if (!response.isSuccessful()) {
      throw new IOException(
          response.errorBody() != null ? response.errorBody().string() : "Unknown Error");
    }
    return response.body();
  }
}
