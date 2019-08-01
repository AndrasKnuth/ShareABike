package com.shortit.kryptonite.Retrofit;

import org.springframework.stereotype.Component;
import retrofit2.Retrofit;

@Component
public class BitlyClient {

  private BitlyInterface bitlyInterface;

  public BitlyClient() {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl()
  }
}
