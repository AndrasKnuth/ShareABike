package com.shortit.kryptonite.Retrofit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RebrandlyModel {
  private String id;
  private String title;
  private String slashtag;
  private String destination;
  private String createdAt;
  private String updatedAt;
  private String shortUrl;
  private String [] domain;
}
