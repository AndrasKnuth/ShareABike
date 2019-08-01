package com.shortit.kryptonite.Retrofit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BitlyModel {

  private String long_url;
  private String link;
  private Object references;
  private boolean archived;
  private String[] tags;
  private String created_at;
  private String title;
  private Object[] deeplinks;
  private String created_by;
  private String client_id;
  private String[] custom_bitlinks;
  private String id;
}
